package 异常处理;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class Exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        String val=null;
//       1. 空指针异常
//        System.out.println(val.length());

//        2.数组越界异常
//        int [] arr={1,2,4};
//        System.out.println(arr[3]);
//        3.类型转换异常
        A a1=new A();
//        B b1=(B)a1;

//        try——catch处理异常
        try {
//           4. 数值运算异常
            int res=num1/num2;
        }catch(Exception e){
            e.printStackTrace();
        }
//        5.数值格式不正确异常
        String numStr="asd";
        int a=Integer.parseInt(numStr);
        System.out.println(a);

    }
}
class A{

}
class B{

}
