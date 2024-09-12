package 抽象类;

public class Abstract01 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.hello();
    }
}

abstract  class Animal{
    public  String testName="抽象类中的普通方法";
    public void eat(){
        System.out.println("抽象类中的普通方法");
    }
    public Animal(){

    }
    public abstract  void hello();//抽象方法不能有函数体
}
class Dog extends Animal{
    @Override
    public void hello() {
//        重写抽象父类的方法
        long start=System.currentTimeMillis();
        long sum=0;
        for (int i=0;i<100000000;i++){
            sum+=i;
        }
        long  end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
