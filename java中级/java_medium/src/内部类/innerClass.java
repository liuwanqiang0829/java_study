package 内部类;

public class innerClass {
    public static void main(String[] args) {
         Outerclass o1=new Outerclass();
         o1.call();
         o1.anonymouseInnerClass();
    }
}
class  Outerclass{
    private String val1="Outerclass的私有属性";
    private String val="Outerclass的私有属性";
    public void anonymouseInnerClass(){
//        基于接口实现的
        anonymouseInterface a1=new anonymouseInterface() {
            @Override
            public void print() {
                System.out.println("匿名内部类实现anonymouseInterface接口的方法");
            }
//            此时a1的编译类型是anonymouseInterface,但是运行类型是一个类，系统底层给该类命名了,并且马上就创建了一个对象实例
        };
        a1.print();
        System.out.println("匿名内部类的类名是=="+a1.getClass());
//        基于父类的匿名内部类
//        AnonymouseClass a2=new AnonymouseClass();这种方式运行类型肯定是AnonymouseClass
//        但是下面这种重写AnonymouseClass类的方式的类名就变成了内部类.Outerclass$2
        AnonymouseClass a2=new AnonymouseClass(){
            @Override
            public void fun() {
                System.out.println("类实现的匿名内部类的方法");
            }
        };
        a2.fun();
        System.out.println("类实现的匿名内部类="+a2.getClass());
//        基于抽象类匿名内部类，必须实现抽象类的方法


    }
    public void call(){
//        局部内部类
        class CallClass{
//            可以直接访问外部类的所有成员和方法，包含私有的
            private String val="CallClass的私有属性";
            public void visitOuter(){
                System.out.println("访问外部类的属性="+val1);
                System.out.println("访问同名成员的时候根据就近原则="+val);
                System.out.println("访问外部类的变量可以根据类名.this.成员="+Outerclass.this.val);
            }
        }
        CallClass c1=new CallClass();
        c1.visitOuter();
    }
    public Outerclass(){
        System.out.println("Outerclass类的构造器");
    }
//    成员内部类
    class Inner01{

    }
}

//匿名内部类的接口
interface anonymouseInterface{
    public void print();
}
class AnonymouseClass{
    public  String name="匿名内部了要实现的类";
    public  void fun(){
        System.out.println("匿名函数的内部类方法的实现~~~");
    }
}
