package 接口.interface01;

public class ClassAndInterface {

}

class Monkey{
    public void jump(){
        System.out.println("猴子天生会跳");
    }
}
//鱼的游泳功能
interface  FishInterface{
   public void swim();
}
interface BridInterface{
    void fly();
}
 class Monkey01 extends Monkey implements FishInterface,BridInterface{

     @Override
     public void swim() {
         System.out.println("猴子像鱼一样游泳");
     }

     @Override
     public void fly() {
         System.out.println("小猴子像鸟一样飞翔");
     }
 }