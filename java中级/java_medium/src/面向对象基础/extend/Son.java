package 面向对象基础.extend;

public class Son extends Father{
    //Son是继承的子类/派生类
    public double GPI;
    public void Print(){
        System.out.println(this.GPI);
    }
    public Son(){
        //this会调用自身的构造器，super是调用父类的构造器，并且两者不能共存于同一个构造器的顶部
        this("张三",10,12);
    }
    public Son(String name,int age,double GPI){
        //super();默认调用父类的无参构造器,
        //如果父类中的无参构造器被覆盖了，那么只能使用super关键字来调用其他构造器，如下
        super(name,age);//参数的位置和构造器参数位置一致，super使用的时候必须放在第一行，并且只能在构造器中使用
        //this()和super()都只能放在构造器的第一行，并且两者在同一个构造器中只能显示其中一个
        //this(name,age,GPI);
        this.GPI=GPI;
    }
}
