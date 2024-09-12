package 面向对象基础.extend;

public class superBase extends Father {
    //super代表父类的引用，用于访问父类的属性，方法和构造器
    //基本语法
    //1.访问父类的属性，但不能访问私有属性和方法：super.属性名，super.方法名(参数列表)
    //2.访问父类的构造器只能放在第一行并且和this调用本身的构造器不能同时使用
    //3.如果父类和子类的属性或者方法没有重名的，那使用super和this的效果是一样的，或者直接使用如this.name=super.name=name
    //4.使用一个方法或者属性的时候，优先在本类中找，没有找到，然后再在父类中找，如果能调用，则使用，依次往上走直到Object,如果没有找到
    //则会报错，满足就近原则
    //5.super的访问不限于直接父类，如果父类的父类中包含同名的属性或者方法，会遵循就近原则先会在离super最近的类里面找
    //6.this访问属性会在本类中先找，如果没有找到再从父类中找，super是直接访问父类属性或者方法
    //7.调用父类构造器的好吃在于，父类属性由父类初始化，子类的属性由子类初始化
    //8.当子类中和父类中的成员(属性和方法)重名的时候，为了访问父类的成员，必须通过super。如果没有重名使用super,this和直接访问是一样的
     public  String name="子类的name";
     public void test(){
         System.out.println("super调用的是父类的"+super.name);//super调用父类的属性
         System.out.println("直接访问name属性为子类的name=="+name);
         System.out.println("this访问的是子类的name==="+this.name);
      }


}
