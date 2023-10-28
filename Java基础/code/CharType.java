public class CharType{
  public static void main(String[] args){
    char str1='a';//字符只能用单引号，双引号代表字符串
    char str2='b';
    char str3=977;//字符类型可以直接存放一个数字,但是这个字符为unicode码中数字对应的那个值
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    char str4='b'+1;
    System.out.println((int)str1);//将str1对应的字符转为对应的unicode码对应的数字，unicode是基于ASCII码表拓展的
    // char类型是可以进行运算的，相当于一个unicode对应的整数，因为它都对应有unicode码,得到的是一个整数
    System.out.println('a'+1);//等于98
    System.out.println(str4);//等于c
  }
}