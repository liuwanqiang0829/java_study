## 日期类Date (第一代日期类)
1. 获取当前系统的时间 `Date date1=new Date()`
2.  设置时间的格式'yyyy年MM月dd日 hh:mm:ss E'年月日 时分秒 星期
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
    String formatDate=sdf.format(date1);
3. 通过毫秒数获取时间 `new Date(974834832)`
4. String s="2024年7月14日 12:20:48 星期日";
   把String转换成Date时，使用的sdf格式需要和你给的String格式会一致，否则会报错
   Date parseStr=sdf.parse(s);
   System.out.println("parseStr="+parseStr);


## Calendar日历类(第二代日期类)
Calendar是一个抽象类，它为特定的瞬间与一组诸如year,month,day_of_month,hour等日历字段之间
转换提供了一些方法，并为操作日历字段(例如获得下星期的日期)提供方法。
```
public abstract class Calendar extends Object implements Serializable,Cloneable,
Comparable<Calendar>
```
### 构造器
Calendar的构造器是抽象的，并且构造器是private私有的
但是可以通过getInstance方法获取实例
1. Calendar()无参构造器
2. Calendar(TimeZone,Locale)

## 第三代日期类
前两代的日期类不足的分析
Date类它的大多数方法在在JDK1.1引入Calendar之后就被弃用了。
但是Calendar页存在问题
1. 可变性：像日期和时间这样的类应该是不可变的
2. 偏移性：Date中的年份从1900开始的，而月份都是从0开始
3. 格式化：格式化只对Date有用，Calendar则不行
4. 此外，线程也不是安全的，不能处理闰秒等(每隔两天，多出一秒)

第三代日期类：在jdk8引入的
常见方法：
1. LocalDate只包含日期，可以获取日期的字段
2. LocalTime只包含时间，可以获取时间字段
3. LocalDateTime(日期时间):包含日期+时间，可以获取日期和时间字段

```java
public class LocalDateTimeMethods {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt=="+ldt);
        System.out.println("年="+ldt.getYear());
        System.out.println("月="+ldt.getMonth());
        System.out.println("月="+ldt.getMonthValue());
        System.out.println("日="+ldt.getDayOfMonth());
        System.out.println("时="+ldt.getHour());
        System.out.println("分="+ldt.getMinute());
        System.out.println("秒="+ldt.getSecond());
        
//        实现日期定制化使用DateTimeFormatter对象进行格式化
        DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String strDate= dft.format(ldt);
    }
}

```
### 实现日期的格式化
实现日期定制化使用DateTimeFormatter对象进行格式化
`DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");`
其中yyyy代表年份，并且年份为四位数，MM代表月份并且是两位数，dd代表日期并且两位数...

获取时间戳
Instant instant=Instant.now();
instant就是一个时间戳对象
1. 可以通过Date.from方法将Instant转成Date
2. 可以将date转成Instant：
3. Instant instant=date.toInstant()


### plus和minus方法
plus和minus方法可以对当前时间进行加减



