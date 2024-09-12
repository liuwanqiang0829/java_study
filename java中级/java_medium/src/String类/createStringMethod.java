package String类;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class createStringMethod {
    public static void main(String[] args) {
//        直接赋值：先从常量池中查看是否有对应的字符数据空间，如果有直接指向，如果没有则重新创建，然后指向
        String s1="str";//s1最终指向常量池的空间地址
//        先在堆中创建空间，里面维护value属性，指向常量池"str"的空间，如果常量池中没有"str",重新创建，
//        如果有，直接通过value指向，最终指向堆中的空间地址
        String s2=new String("str");
        System.out.println(s1==s2);//false:s2指向堆中的对象，s1指向常量池
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2.intern());
//        intern:返回字符串对象的规范表示,简单来说就是池中已经包含了一个等于此String对象字符串(用equals方法确定)

//        将String常量池中的对象地址返回
        System.out.println(s2==s2.intern());
    }
}


