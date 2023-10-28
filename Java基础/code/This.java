public class This{
  public static void main(String[] args){
     ThisObj p1=new ThisObj("张三",23);
    //  ThisObj p2=new ThisObj("李四",34);
    //  System.out.println("p1的哈希地址"+p1.hashCode()+"p2的哈希地址"+p2.hashCode());
    ThisObj p3=new ThisObj("李四");
     System.out.println("p1.name"+p1.name+"p1.age"+p1.age);
     System.out.println("p3.name"+p3.name+"p3.age"+p3.age);
     p1.f2();
  }
}
//hashCode是一个内置的方法，内部返回的是对象的hash码值-
class ThisObj{
  String name;
  int age;
  ThisObj(String name,int age){
    this.name=name;
    this.age=age;
    
  };
  //构造器2，引用构造器1的参数
  ThisObj(String name){
    this("张三",56);//调用另一个构造器，并且放在第一局
    this.name=name;//会覆盖相同上一条语句
  };
  public void f1(){
    System.out.println("f1方法被调用了");
  }
  public void f2(){
    this.f1();
    System.out.println("f2方法调用f1方法");
  }
}
