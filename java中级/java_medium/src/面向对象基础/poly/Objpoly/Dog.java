package 面向对象基础.poly.Objpoly;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void feed(){
        System.out.println("小狗吃狗粮");
    }
}
