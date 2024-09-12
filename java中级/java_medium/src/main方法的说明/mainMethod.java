package main方法的说明;

public class mainMethod {
    public static String name="静态属性";
//    非静态属性
    public int age=23;

   public  static void print(){
       System.out.println("静态属性");
   }
   public void p1(){
       System.out.println("非静态方法");
   }

    public static void main(String[] args){
//       在main方法中可以访问静态属性
        System.out.println(name);
//        在main方法中可以访问静态方法
        print();
//        不能访问非静态属性和静态方法
//        System.out.println(age);
//        p1()
//        如果mian方法要访问非静态方法，需要创建对象
        mainMethod m1=new mainMethod();
        System.out.println(m1.age);
        m1.p1();
    }

}
