package 面向对象基础.override.training;

public class Person {
    private String name="person类";
    private int age=18;
   public  Person(String name,int age){
       this.name=name;
       this.age=age;
   }
    public void say(String str){
       System.out.println("Person类"+str);
   }
}
