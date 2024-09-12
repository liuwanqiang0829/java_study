package 面向对象基础.override;

public class Animal {
    //重写方法，没有返回类型
    public void cry(){
        System.out.println("动物交换");
    }
    //重写父类的方法时，如果有返回类型，必须要满足父类返回类型是子类的返回类型的父类或者类型一致
    public Object fun1(){
        System.out.println("父类的返回类型是Object,子类是String是Object的子类");
        return  null;
    }
    public void eat(){

    }
}
