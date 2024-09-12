package 接口.interface01;

public class Main {
    public static void main(String[] args) {
        Camera c1=new Camera();
        Phone p1=new Phone();
        Computer com1=new Computer();
        mutilInterfaceClass m1=new mutilInterfaceClass();
//        p1.staticMethod();
        com1.work(c1);
        com1.work(p1);
//        继承类和实现接口的区别
        Monkey01 mon1=new Monkey01();
        mon1.jump();
        mon1.swim();
        mon1.fly();
    }
}
