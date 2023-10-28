public class AutoConvertDetail{
  public static void main(String[] args){
    // 当有多种类型混合运算的时候，系统会自动将所有数据转为容量最大的那种类型再进行运算
    int n1=10;
    // float d1=n1+1.1;//会报错误，因为float不是容量最大的那种类型，但是在指定类型就不会报错如下
    float d2=n1 +1.1f;//不会报错
    double d1=n1+1.1;//不会报错
    // int a=1.1//会报错，大精度不能转为小精度
    double d3=10;//可以的
    
    // (byte,short)和char之间不会相互自动转换
    //当把值赋给byte类型时，会先判断这个值是否在byte的范围内(-128-127),如果是就可以

    // 结论:当我们把精度(容量)大的数据赋值给精度(容量)小的数据类型的时候，就会报错，反之就会进行自动类型转换
    
    // byte,short,char他们三者可以相互计算，在计算时无论哪种类型都要转成int,并且同类型的也要转成int
    // boolean类型不参与转换
  byte bt=(byte) 2000;
 System.out.println(bt);
    //  自动类型提升原则：当表达式中有多种类型计算，结果为类型最大的那个类型
    // double类型可以接收float类型

    int x=(int)(10*0.1+12);//此时强转符号只争对最近的操作数有效，可以采用小括号提升优先级(int)10*0.1+12=>(int)(10*0.1+12)
    System.out.println(x);
    int a=100;
    char str=(char)a;
    System.out.println(str);
  }
}