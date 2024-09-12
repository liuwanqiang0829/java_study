package 面向对象基础.poly.polyDetail;


public class Cat extends Animal {
    public int temp=12;
    public Cat(String name) {

        super(name);
    }
    public void catFun(){
        System.out.println("cat中的方法不能在多态情况下使用");
    }
    public void display(){
        System.out.println("Cat类的display方法，访问Cat类中的temp变量，temp==="+temp);
    }
}
