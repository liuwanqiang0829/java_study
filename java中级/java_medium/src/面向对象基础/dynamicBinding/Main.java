package 面向对象基础.dynamicBinding;

public class Main {
    public static void main(String[] args) {
        A b=new B();
        System.out.println("sum==="+b.sum());
        System.out.println("sum1==="+b.sum1());
        //调用sum的时候会调用getI方法，所以会涉及java动态绑定机制
        //java动态绑定机制：
        //1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定。也就是调用B的父类的方法时，
        // 该方法中还调用了与B中相同名称的方法，此时会调用B中同名的方法
        //2.当调用对象的属性时，没有动态绑定机制，哪里声明，哪里使用。

        //所以上述的System.out.println(b.sum());结果为30,因为b已经和new B()绑定，会优先访问new B(),
        // 使用new B()的getI()方法，getI执行的时候因为属性没有动态绑定机制，那里声明那里使用，所以会调用new B()中的i
    }
}
class A{
    public int i=10;
    public int sum(){
        return  getI()+10;
    }
    public int getI(){
        System.out.println("调用A中的getI方法");
        return i;
    }
    public int sum1(){
        return  i+123;
    }
}
class  B extends  A{
    public  int i=20;
    public int age=12;
//    public int sum(){
//        System.out.println("我是B中的sum方法");
//        return getI()+i;
//    }
    public int getI(){
        System.out.println("调用B中的getI方法");
        return i;
    }
    public int sum1(){
        return  i+9000;
    }
}
