package 面向对象基础.poly;

public class polyBase {
    public static  void main(String[] args){
       B b=new B();
       A a=new B();//左右类型可以不一致，也即是编译类型和运行类型
      //sum参数不一样就会调用不一样的sum方法
      int s= b.sum(2,2,3);
      int s1=b.sum(2,2);
        System.out.println(s);
    }
    //多态的具体体现
    //1. 方法的多态，重写和重载就是方法的多态
    //2.对象的多态(核心，困难，重点)
       //(1)一个对象的编译类型和运行类型可以不一致，如Animal animal=new Dog()
       //(2)编译类型在定义对象时，就确定了，不能改变
       //(3)运行类型是可以变化的
       //(4)编译类型看定义时=号的左边，运行类型看=号的右边.

}

class A{
    public void say(){
        System.out.println("A类中的say方法被调用");
    }
}
class B extends A{
    public int sum(int a,int b,int c){
        System.out.println("三个参数的sum方法"+a+b+c);
        return  a+b+c;
    }
    public  int sum(int a,int b){
        System.out.println("两个参数的sum方法"+a+b);
        if(a==b){
            System.out.println("a等于b");
        }
        return  a+b;
    }
    public void say(){
        System.out.println("重写父类的say方法");
    }
}