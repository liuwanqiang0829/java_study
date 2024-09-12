package 常用类;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {

        BigInteger bI1=new BigInteger("1212121212121213333333");
        BigDecimal bd1=new BigDecimal("121212121212121212121212");
        System.out.println("bI1="+bI1+" "+"bd1="+bd1);

//       对BigInteger和BigDecimal进行运算操作的时候需要调用对应的方法，不能像基本数值类型一样进行运算
        System.out.println("add="+bI1.add(new BigInteger("2323232323")));
        System.out.println("减subtract="+bI1.subtract(new BigInteger("789787878788")));
        System.out.println("乘multiply="+bI1.multiply(new BigInteger("12312312312")));
        System.out.println("除divide="+bI1.divide(new BigInteger("323232122")));
        System.out.println("bd-add="+bd1.add(new BigDecimal("12312312321321312")));
        System.out.println("bd-减subtract="+bd1.subtract(new BigDecimal("32312211212")));
        System.out.println("bd-乘"+bd1.multiply(new BigDecimal("1213213121212")));
//        BigDecimal类型的除法可能会出现异常，因为出现了无线循环的小数
        System.out.println("bd-除="+bd1.divide(new BigDecimal("2")));
//        解决除法运算的时候指定精度
//        bd1.setScale(5);
        System.out.println("bd-除指定精度解决循环小数的问题="+bd1.divide(new BigDecimal("124343121111")));

    }
}
