package Object方法;

public class Objectequals {
    public static void main(String[] args) {
//        1. ==号既可以判断基本类型，又可以判断引用类型
//        2. ==号如果判断基础类型，判断值是否相等
//        3. ==号如果判断引用类型，判断的是地址是否相等，即判断是否同处于一个对象
        System.out.println(10==10.0);//true
//        使用
        "hell0".equals("abc");
//        equals方法在不同的类中有着是不同的逻辑实现，简单来说就是将Object中的equals方法重写了，
//        比如Integer,String中的方法就是重写equals方法
        String str1=new String("abc");
        String str2=new String("abc");
        System.out.println(str1==str2);//false,这是因为==号判断引用类型的时候是比较地址
        System.out.println(str1.equals(str2));//true,这是因为equals判断的时候采用的是比较值

//   查看某个Java原生的方法源码，可以选择这个方法->然后右键点击goto->选择Declaration or Usages。或者直接选中这个方法ctrl+B
    }
}
