package 面向对象高级;

public class classVariable {
    public static void main(String[] args) {
        VariableChild c1=new VariableChild();
        VariableChild c2=new VariableChild();
        VariableChild c3=new VariableChild();
//        可以通过对象实例来访问，也可以在类的定义里面直接使用类名来访问变量
        c3.count++;
        System.out.println(c3.count);
        c1.join();
        c2.join();
        
        System.out.println("使用类名来访问public的静态变量"+VariableChild.count);
        VariableChild c4=new VariableChild();
//        System.out.println(VariableChild.staticName);
//        System.out.println(c4.staticName);

        System.out.println("可以通过外部的类名访问"+VariableChild.ProtectedVar);
        System.out.println("可以通过外部的实例访问"+c4.ProtectedVar);
        System.out.println("可以通过外部的类名来访问"+VariableChild.defaultVar);
        System.out.println("可以通过外部的实例来访问"+c4.defaultVar);
    }
}

class VariableChild{
    private String name;

    //此时的count就是类变量，static就是静态，该变量会被VariableChild类的实例共享，类变量可以通过类名来访问
    public  static  int count=0;
//    private定义的变量不会被实例和外部的类名访问到，只能在本类中使用到
    private static  String staticName="私有的静态变量";
    protected  static  String ProtectedVar="受保护的变量";
    static String defaultVar="没有修饰符的变量";
    public void join(){
//        可以通过类的实例来访问
        VariableChild.count++;
        this.count++;
        name="121";
//        内部可以使用类名来访问私有的静态变量
        System.out.println(VariableChild.staticName);
        System.out.println("现在已经有"+VariableChild.count+"人加入");
    }
}