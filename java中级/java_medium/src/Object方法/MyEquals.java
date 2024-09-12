package Object方法;

public class MyEquals {

    public static void main(String[] args) {
        Person p1=new Person("张三",23);
        Person p2=new Person("张三",23);
        System.out.println(p1.equals(p2));
        Equals e1=new Equals();
        Equals e2=new Equals();
        e1.name="abc";
        e2.name="abc";
        System.out.println(e1==e2);//false
        System.out.println(e1.equals(e2));//false,这里的equals方法依然继承Object的，所以依然比较的内存地址
        System.out.println(e1.name.equals(e2.name));//true，这是字符串的equals方法是挨个比较值
        char c1=12;
        System.out.println("12==c1"+(c1==12));
        char c2='A';
        System.out.println("c1=='A'"+(c2==65));
    }
}
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return  true;
        }
//        类型的判断
        if(obj instanceof  Person){
            Person p1=(Person) obj;
//            这里的name为String引用类型，age为int类型，所以name可以使用equals方法，而int是没有这个方法
           return this.name.equals(p1.name)&& this.age==p1.age;
        }
        return  false;
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
}
class Equals{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
