package 面向对象基础.encapsulation;

public class example {
    private String name="张三";
    private double salary=12230;
    private int age=23;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //构造器和访问器的使用，可以将访问器写在构造器中，添加访问权限设置功能
    public  example(String name, int age,double salary){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
