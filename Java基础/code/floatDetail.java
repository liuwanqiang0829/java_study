public class floatDetail{
  public static void main(String[] args){
    //java的浮点型常量默认为double类型，声明为float型常量，后面须加‘f’或者‘F’,通常情况下会选择double类型，因为更精准
    // float num1=1.1编译会报错
    // 十进制形式
    float num2=1.1f;
    double num3=1.1;
    double num4=.234;//0.234的0可以省
    double num5=5.234;
    // 科学计数法
    double num6=5.3434E8;
    double num7=5.1234123;
    float num8=5.123E8f;
    float num9=5.1234123f;
    System.out.println(num6);
    System.out.println(num7);
    // 浮点数的陷阱
    double num10=2.7;
    double num11=8.1/3;//num11为一个无限接近2.7的一个小数
    System.out.println(num10);
    System.out.println(num11);
    System.out.println(Math.abs(num10-num11));
  }
}