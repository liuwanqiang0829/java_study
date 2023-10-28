public class Scoped{
  public static void main(String[] args){
     Method aa=new Method();
     aa.eat();
  }
}
class Method{
    int age;//全局变量,初始为0
    public void eat(){
      String name="张三";//局部变量，定义未初始化，不能使用
      System.out.println("age=="+age+"name==="+name);
    }
}