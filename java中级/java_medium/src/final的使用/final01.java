package final的使用;

public class final01 {
    public static void main(String[] args) {
        Child c1=new Child();
        System.out.println("输出final和static修饰的属性，类就不会加载了"+Test02.num);
    }
}

class  Father{
    public final void finalMethod(String val1){
        System.out.println(val1);
    }
}
class Child extends Father{
//    final修饰的属性不能修改，并且要有初始值，当然也可以在构造器和代码块中赋初始值
    public final String TAX_VALUE="TEXT";
    public final String TAX_VAL2;
    public final String TAX_VAL3;
    public final static  String TAX_STR;
    {
        TAX_VAL2="代码块中赋值";
    }
    static {
        TAX_STR="static修饰的final变量只能在static代码块中赋初始值";
    }
    public Child(){
        TAX_VAL3="普通常量可以在构造器中华赋值";
    }

//    @Override
//    public void finalMethod(String val1){
//
//    }
    public void TESTMethods(){
//        局部常量不能修改
        final double val=12.3;
    }
}
class Test02{
    public final static int num=1000;
    static {
        System.out.println("静态代码块-final和static搭配使用之后就不会加载类");
    }
    {
        System.out.println("普通代码块-final和static搭配使用之后就不会加载类");
    }
    public Test02(){
        System.out.println("构造器-final和static搭配使用之后就不会加载类");
    }
}