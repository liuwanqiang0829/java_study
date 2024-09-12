package 面向对象基础.modifier;

public class modifier {
    public static void main(String[] args) {
       example temp= new example();
       //同一个包里面可以访问默认default,public,protected修饰的属性或方法
        System.out.println(temp.age);
        System.out.println(temp.name);
        System.out.println(temp.fun1());
        System.out.println(temp.fun2());
        System.out.println(temp.fun3());
        System.out.println(temp.age);

    }
}
