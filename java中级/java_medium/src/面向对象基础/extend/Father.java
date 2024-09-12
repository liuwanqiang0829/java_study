package 面向对象基础.extend;

public class Father {
    //继承的父类/基类
    public int age=23;
    public String name="张三";
    private double money=123.122;
    public  void test(){
        System.out.println(name+" "+age);
    }
    //公共方法访问私有属性
    public void common(){
        System.out.println("money"+money);
        System.out.println(fun());
    }
    private String fun(){
        return  "通过公共方法访问私有方法";
    }
//    如果父类中的无参构造器被覆盖了，那么只能使用super关键字来调用其他构造器
    public Father(){
        System.out.println("我是父类的无参构造器，我被调用了");
    }
    public  Father(String name,int age){
        this.age=age;
        this.name=name;
    }
}
