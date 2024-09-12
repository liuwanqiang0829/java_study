package 日期类Date;

import java.text.*;
import java.util.*;
import java.util.logging.SimpleFormatter;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class DateMethods {
    public static void main(String[] args) throws ParseException {
//        获取当前系统的时间
        Date date1=new Date();
        System.out.println("date1="+date1);
//        设置时间的格式'yyyy年MM月dd日 hh:mm:ss E'年月日 时分秒 星期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String formatDate=sdf.format(date1);
        System.out.println("formatDate="+formatDate);
//        通过毫秒数获取时间
        System.out.println(new Date(974834832));
//        把一个格式化的String转成对应的Date
        String s="2024年7月14日 12:20:48 星期日";
//        把String转换成Date时，使用的sdf格式需要和你给的String格式会一致，否则会报错
        Date parseStr=sdf.parse(s);
        System.out.println("parseStr="+parseStr);
    }
}
