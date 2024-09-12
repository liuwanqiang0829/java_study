package 日期类Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 刘万强~
 * @version 1.0
 **/
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
        DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String strDate= dft.format(ldt);
        System.out.println("strDate="+strDate);

//        获取时间戳
        Instant instant=Instant.now();
        System.out.println("instant="+instant);

//        对当前时间进行加减
        LocalDateTime ldt2=ldt.plusDays(350);//当前时间加上三百五十天
        LocalDateTime ldt3=ldt.minusMinutes(2345);//当前时间减去2345分钟前
        System.out.println("ldt2="+ldt2);
        System.out.println("ldt3="+ldt3);
    }
}
