package 面向对象基础.poly.polyArray;

public class Teacher extends Person{
    private double salary;
    public Teacher(String name, int age,double salary){
        super(name,age);
        this.salary=salary;
    }
    public void teach(){
        System.out.println("老师"+this.getName()+"正在上课");
    }
}
