import 面向对象基础.modifier.example;

public class Access {
    public static void main(String[] args) {
        //访问修饰符
        //java提供了四种访问控制修饰符，用于控制方法和属性(成员变量)的访问权限
        //1.公开级别：用public修饰，对外公开
        //2.受保护级别的：用protected修饰，对子类和同一个包中的类公开
        //3.默认级别：没有修饰符，向同一个包中的类公开
        //4.私有级别的：用private修饰，只有类本身可以访问，不对外公开
        example temp=new example();
        System.out.println(temp.n1);//此时只能访问类里面使用public修饰的属性或者方法

        B b=new B();
        b.test();
    }
}
class A{
    String name="1212";
    protected int age=123;
    private String gender="男";
    public A(String name){
        this.name=name;
    }
    public A(String name,int age){
        this.name=name;
        this.age=age;
    }
    public A(){

    }

}

class B extends A{
    public B(String name){
        super(name);
    }
    public B(){
        super();
    }
    public  void test(){
        System.out.println("子类可以访问"+super.name+super.age);
    }
}