package 面向对象基础.override;

public class Test {
    //方法覆盖：就是子类的有一个方法和父类的某个方法的名称，参数一样，那么我们就说这个子类的方法覆盖了父类的方法
    //重写父类的方法时，如果有返回类型，必须要满足父类返回类型是子类的返回类型的父类，比如父类返回Object,子类返回String
    //子类的方法不能缩小父类方法的访问权限。public>protected>默认>private
    public static  void main(String[] args){
        Dog dog=new Dog();
        dog.cry();
        dog.fun1();
    }
}
