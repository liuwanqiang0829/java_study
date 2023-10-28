public class ObjectBase{
  public static void main(String[] args){
    Cat cat1=new Cat();
    cat1.name="小白";
    cat1.age=18;
    Cat cat2=new Cat();
    cat2.name="小黑";
    cat2.age=23;
    cat1.speak("cat1");
    cat2.speak("cat2");
  }
}
// 创建一个类
class Cat{
  String name;
  int age;
  public void speak(String a){
    System.out.println(a+"对象方法执行了");
  }
};
