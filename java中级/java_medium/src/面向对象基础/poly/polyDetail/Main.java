package 面向对象基础.poly.polyDetail;


public class Main {
    //多态的细节和注意事项
    //多态的前提：两个类(对象)之间继承关系
    //多态向上转型
    //1.本质：父类的引用指向了子类的对象也即是向上转型
    //2.语法：父类类型 引用名=new 子类类型(),如下
    public static void main(String[] args) {
        Animal animal=new Cat("小猫");//同理如下
        Object animal1=new Cat("小猫的Object类");//父类的父类也可以做多态
        //3.特点：编译类型看左边，运行类型看右边。可以调用父类中的所有成员(遵循访问权限),
        // 不能调用子类中特有的成员，具体实现要看子类的实现，因为在编译阶段，能调用那些成员是由编译类型来确定的
        //即：多态不能访问父类具有权限控制的方法或者属性，并且不能访问子类中特有的方法
        animal.eat("猫粮");//父类中的  公共方法可以使用
//        animal.privateFun();
        //但是animal.privateFun()为私有方法不能使用
        //cat子类中的catFun为子类特有的方法也不能使用，因为在编译阶段，能调用那些成员是由编译类型来确定的
        //多态访问也遵循就近原则
        //多态的向下转型
        //1.语法：子类类型 引用名=(子类类型) 父类引用
        //2.只能强转父类的引用，不能强转父类的对象
        //3.要求父类的引用必须指向的是当前目标类型的对象
        //4.当向下转型后，可以调用子类类型中的所有成员

        Cat cat=(Cat) animal;//向下转型，并且要求父类的引用必须指向的是当前目标类型的对象，即animal要是Cat类才能转，
        // 而且此时的cat和animal指向同一个对象，只是编译类型的不同，导致调用的类型不一致
        cat.catFun();//此时可以调用Cat类中的方法

        //此时Dog dog=(Dog) animal编译后会报错因为父类的引用必须指向的是当前目标类型的对象，而此时animal为Cat类和Dog类不一致
        // Dog dog=(Dog) animal;


        //多态-属性重写的问题
        //属性没有重写之说，属性的值看编译类型
        // instanceOf比较符用于判断对象的运行类型是否为XX类型或者XX类型的子类型
        System.out.println("instanceOf==="+(cat instanceof Cat));//true,因为cat指向的就是Cat类
        System.out.println("instanceOf==="+(animal instanceof Cat));//true，因为animal和cat指向的都是new Cat
        System.out.println(cat instanceof Animal);//true,Cat是Animal的子类型因此cat也是Animal类型，

        // 或者说new Cat()是Animal的子类型

        //使用：obj instanceOf Object
        System.out.println("向上转型之后temp为父类中的temp==="+animal.temp);//当子类和父类有相同的属性的时候会先访问父类中的变量
        System.out.println("向下转型之后的temp为子类中的temp==="+cat.temp);//当子类和父类有相同的属性的时候会先访问子类中的变量

        //访问属性是看编译类型，访问方法看运行类型,一般用于子类和父类有同样的方法的情况下，如果没有相同的方法只会依照就近原则查找类方法
        cat.display();//cat的运行类型是Cat，如果cat中没有display方法就会访问父类中的display方法
        animal.display();//animal的运行类型是Cat,但是如果在编译时找不到display方法就会编译不通过
        System.out.println("cat中temp变量是Cat类中的temp==="+cat.temp);//因为访问属性看编译类型
        System.out.println("animal中temp变量是Animal类中的temp==="+animal.temp);//因为访问属性看编译类型
    }
    

}
