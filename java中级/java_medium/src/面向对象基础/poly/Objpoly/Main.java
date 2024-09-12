package 面向对象基础.poly.Objpoly;

public class Main {
    //对象的多态(核心，困难，多态)
    //(1)一个对象的编译类型和运行类型可以不一致，如Animal animal=new Dog()
    //(2)编译类型在定义对象时，就确定了，不能改变
    //(3)运行类型是可以变化的
    //(4)编译类型看定义时=号的左边，运行类型看=号的右边.
    public static void main(String[] args) {
        //体验对象多态
        Action action=new Action();
        Animal cat=new Cat("小猫");//animal就是向上转型，Animal类型转为Cat类型就是向上转型
        Animal dog=new Dog("小狗");
        Animal pig=new Pig("小猪");
        action.animalCry(cat);
        action.animalCry(dog);
        action.animalCry(pig);
    }
}