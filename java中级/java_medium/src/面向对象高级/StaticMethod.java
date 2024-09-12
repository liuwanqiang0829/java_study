package 面向对象高级;

public class StaticMethod {
    public static void main(String[] args) {

        Student stu=new Student("张三");
        stu.payFee(123);
        Student stu1=new Student("李四");
        stu1.noStaticMethod();
        stu1.payFee(456);
        Student.payFee(678);
    }
}
class Student{

    private String name;
    private static double fee=0;
    public  Student(String name){
           this.name=name;
    }
//    1.当方法使用static修饰后，该方法就是静态方法。2.静态方法就可以访问静态属性和变量
    public static void payFee(int num){
       fee+=num;
//       静态方法中不能使用this,而且只能访问类变量，不能使用属性
        System.out.println("姓名为学费之和为："+fee);
    }
    public void noStaticMethod(){
        System.out.println("普通方法访问静态变量this.fee="+this.fee+"fee="+fee+"Student.fee="+Student.fee);
//        访问静态方法,三种方式
        this.payFee(1000);
        payFee(1000);
        Student.payFee(1000);
    }
}

