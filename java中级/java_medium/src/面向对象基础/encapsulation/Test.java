package 面向对象基础.encapsulation;

public class Test {
    public static void main(String[] args) {
        example test=new example("张三",33,123000.2);
        test.setName("张三");
        System.out.println(test.getName());
        System.out.println(test.getAge());
        System.out.println(test.getSalary());
        //封装和构造器的使用
    }
}
