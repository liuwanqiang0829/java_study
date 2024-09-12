package 常用类;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class WrapperType {
    public static void main(String[] args) {
        Boolean b=true;
//        jdk5之前需要手动装箱和拆箱
//        手动装箱 int->Integer
//        int i=100;
//        Integer i1=new Integer(i);
//       手动拆箱Integer->int
//        int i=i1.IntValue()
//        jdk5之后就可以直接装箱和拆箱

        Object num1=true?1:2.0;
//        num1=1.0因为三元运算符是一个整体，所以会进行类型转换
        Object num2;
        if(true){
            num2=2;
        }else{
            num2=4.0;
        }
        System.out.println("num1="+num1+"num2="+num2);
//        num2=2

//        包装类(integer)->String
        Integer num3=100;

//        方式一：
        String str1=num3+"";
//        方式二：
        String str2=num3.toString();

//        方式三：
        String str3=String.valueOf(num3);

        System.out.println("str1="+str1+"  str2="+str2+"  str3="+str3);


//        String->包装类
        String str4="12345";
//        方式1：
        Integer num4=Integer.parseInt(str4);

    }
}
