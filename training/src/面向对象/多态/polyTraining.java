package 面向对象.多态;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class polyTraining {
    public static void main(String[] args) {
//        向上转型访问父类和子类的属性和方法的顺序
        Animal animal1=new Cat();
        System.out.println("animal访问向上转型的属性"+animal1.age);
        animal1.test();
        animal1.animalMethods();//可以访问父类的独有方法
//        animal1.catMethods不能访问子类的方法

//        向下转型
        Cat cat=(Cat) animal1;
        System.out.println("访问向下转型的age属性="+cat.age);
        cat.test();
        cat.catMethod();//访问子类的独有方法
        cat.animalMethods();//访问父类的独有方法
    }
}

class Animal{
    private String name="动物";
    public int age=34;
    public void test(){
        System.out.println("父类的方法访问name属性="+this.name);
    }
    public void animalMethods(){
        System.out.println("animal类的独有方法");
    }
}

class Cat extends Animal{
    private String name="猫";
    public int age=14;
    public void test(){
        System.out.println("猫类的方法访问name属性="+this.name);
    }
    public void catMethod(){
        System.out.println("cat类的独有方法");
    }
}
