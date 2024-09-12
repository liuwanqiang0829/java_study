package 面向对象基础.override;

public class Dog extends Animal {
    //cry方法重写了，所以会以子类的cry方法为准
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
    //重写父类的方法时，如果有返回类型，必须要满足父类返回类型是子类的返回类型的父类
    public String fun1(){
        System.out.println("子类方法重写----父类的返回类型是Object,子类是String是Object的子类");
        return null;
    }
    //不能缩小重写方法的访问范围
   public void eat(){

    }
}
