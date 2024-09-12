package 面向对象基础.override.training;

public class Student extends  Person{
    private String id;
    private int score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(String name, int age){
        super(name,age);
    }
    public  void say(String str){
        System.out.println("Student类的say方法"+str);
    }
}
