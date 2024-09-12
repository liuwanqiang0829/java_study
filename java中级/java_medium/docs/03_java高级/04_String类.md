# String类

## string类
### 字符串的特性
1. String类用于保存字符串，也就是一组字符序列
2. 字符串常量对象是用双引号括起来的字符序列
3. 字符串的字符编码使用Unicode字符编码，一个字符不区分字母还是汉字占两个字节
4. String类中比较常见的构造方法
   1. String s1=new String();
   2. String s2=new String(String original)
   3. String s3=new String(char[] a)
   4. String s4=new String(char[],a,int startIndex,int count)
5. String类实现了`Serializable`接口,说明String可以串行化(即可以在网络中传输)
6. String类实现了`Comparable`接口，表示这个类可以比较大小
7. String类实现了`CharSequence`接口，表示字符序列。
8. String是final表示该类不可继承
9. 底层还是char类型的数组`private final char value[]`,value赋值之后就不可修改(地址不可修改)

```
String a="121"+"abc"//java编译器做了优化，直接将该结果作为对象传入，所以只创建了一个对象
```


### String常用的方法
1. equals: `str.equals(str2)`//判断两个字符串的内容是否相等,区分大小写
2. equalsIgnoreCase: `str.equalsIgnoreCase(str2)`  忽略大小写判断内容是否相等
3. length: `str.length`//返回字符串的长度
4. indexOf: `str.indexOf( 'a' )`//获取字符/字符串的子串在字符串中从0开始查找第一次出现索引，找不到返回-1
5. lastIndexOf: `str.lastIndexOf`//获取字符/字符串在字符串中从字符串的末尾开始向前查找第一次出现索引，找不到返回-1
6. substring: `str.substring(startIndex,endIndex)`从索引startIndex截取到endIndex,但不包括endIndex
7. trim: `str.trim()`//清除字符串首尾的空字符
8. charAt: `str.charAt(2)`获取索引为2的字符
9. toUpperCase()： `将字符串全部变成大写`
10. toLowerCase()
11. concat()
12. compareTo
13. toCharArray
14. format



