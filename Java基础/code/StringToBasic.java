public class StringToBasic{
  public static void main(String[] args){
    
    //基本数据类型转换成字符类型
     int n1=100;
     float f1=1.1f;
     double d1=4.5;
     boolean b1=true;
     String s1=n1+"str";
     String s2=f1+"str";
     String s3=d1+"str";
     String s4=b1+"str";
     System.out.println(s1+"-"+s2+"-"+s3+"-"+s4);//此处可以正确执行，并且将个基本数据类型转为字符串

    // 字符类型转为基本类型
    // 需要通过基本类型对应的包装类调用parseXX方法,
    // 而且要确保转的字符串为基础类型的有效值，如"hello"不能转为数字类型

    String s5="123";
    int num1=Integer.parseInt(s5);
    double num2=Double.parseDouble(s5);
    float num3=Float.parseFloat(s5);
    long num4=Long.parseLong(s5);
    byte num5=Byte.parseByte(s5);
    short num6=Short.parseShort(s5);
    // boolean num7=Boolean.parseBoolean("true");//能转的字符有true和false
    //目前类库里面没有Boolean.parseBoolean这个包装类
    System.out.println(num1+"-"+num2+"-"+num3+"-"+num4+"-"+num5+"-"+num6);
    
    //字符串转为字符->即将字符串的第一个字符取出来

  }
}