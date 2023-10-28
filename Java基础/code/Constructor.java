public class Constructor{
  public static void main(String[] args){
      Person p1=new Person("张三",23);//使用的是第一个构造器
      Person p2=new Person("李四");//使用第二个构造器
  }
}
class Person{
  String name;
  int age;
  //构造器没有返回值，不能写void
  //构造器的名称必须和类Person一样,并且可以有多个
  //(String pName,int pAge)是构造器的形参列表，规则和成员方法一样
  //如果程序员没有定义构造器，系统会自动给类生成一个默认的无参构造器(也叫默认构造器)，自定义构造器会覆盖
  // 默认构造器,除非显示的定义一下，Dog(){}
  public Person(String pName,int pAge){
    name=pName;
    age=pAge;
    System.out.println("使用第一个构造器"+"name=="+name+"age=="+age);
  }
  public Person(String pName){
    name=pName;
    System.out.println("使用第二个构造器"+"name=="+name);
  }
}