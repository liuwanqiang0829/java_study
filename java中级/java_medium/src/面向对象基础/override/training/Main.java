package 面向对象基础.override.training;

public class Main {
    public  static  void  main(String[] args){
      Person person=new Person("父类",47);
      Student student=new Student("子类",23);
      person.say("person");
      student.say("student");
    }
}
