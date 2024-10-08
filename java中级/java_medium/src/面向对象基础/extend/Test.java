package 面向对象基础.extend;

public class Test {
    //继承==代码的复用
    public static void main(String[] args) {
        Son son = new Son("张三三",43,123.1);//ctrl+d可以快速定位
        superBase base=new superBase();
        //1.子类可以继承所有的属性和方法，但是私有属性不能在子类中直接访问，要通过公共方法访问
        //2.子类必须调用父类的构造器，完成对父类的初始化
        //3.当创建子类的时候，不管使用子类的那个构造器，默认情况总是会去调用父类的无参构造器，如果父类没有提供无参构造器
        //则必须在子类的构造器中使用super去指定使用父类的那个构造器完成对父类的初始化工作，否则编译不通过。
        //4.参数的位置和构造器参数位置一致，super使用的时候必须放在第一行，并且只能在构造器中使用
        //5.this()和super()都只能放在构造器的第一行，并且两者在同一个构造器中只能显示其中一个，this调用的是本身的构造器，
        // 且不是当前的构造器，使用this调用本身的其他构造器时，该构造器的默认super就会失效
        //6.java中的所有类都是Object的子类，
        //7.父类的构造器调用不限于直接父类，将一直往上追溯直到Object类(顶级父类)
        //8.对象构造器的执行从对象本身的顶级父类开始执行
        //9.子类最多只有继承一个父类(指直接继承),即java中的单继承机制
        //10.不能滥用继承，子类和父类之间必须满足is-a的逻辑关系，即父类会包含子类的公共属性和方法


        //继承的本质
        //问题：当子类继承父类，创建子类的对象时，内存中发生了什么
        //技巧：ctrl+h选择类名
        // 可以看到类的继承关系
//        Arrays.sort();
        son.test();//访问公共方法
        son.common();//通过公共方法访问私有属性
        base.test();
    }
}
