package 面向对象基础.poly.polyArray;

public class Person {
//    多态数组：数组的定义为父类类型，里面保存的实际元素为子类类型
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String say(){
        return  this.name+" "+this.age;
    }
}
