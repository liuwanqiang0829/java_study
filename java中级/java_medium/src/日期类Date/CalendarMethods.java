package 日期类Date;

import java.util.Calendar;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class CalendarMethods {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        System.out.println("年="+c1.get(Calendar.YEAR));
        System.out.println("月="+c1.get(Calendar.MONTH)+1);//Calendar.MONTH返回的年月日是从0开始
        System.out.println("日="+c1.get(Calendar.DAY_OF_MONTH));
//        Calendar.HOUR获取的是十二小时制的时间，Calendar.HOUR_OF_DAY获取的是
        System.out.println("时"+c1.get(Calendar.HOUR_OF_DAY));
        System.out.println("分="+c1.get(Calendar.MINUTE));
        System.out.println("秒="+c1.get(Calendar.SECOND));
    }
}
