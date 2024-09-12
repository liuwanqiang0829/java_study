package 内部类;

public class MemberClass {
    public static void main(String[] args) {
//        访问内部类的第一种方式
        Outer02 o2=new Outer02();
        o2.useInnerClass();
//      其他外部类使用内部类第一种方式:相当于将new InnterClass01()当成o2的成员来使用
        Outer02.InnterClass01 i1= o2.new InnterClass01();
//        第二种方法就是在内部类所在的外部类中写一个方法返回一个对象
        Outer02.InnterClass01 i2=o2.getInnterClass01();
    }
}
class  Outer02{
    private  String name="外部类的变量";
    public class  InnterClass01{//成员内部类
        public  void print(){
            System.out.println("成员内部类~~~"+"访问外部类的成员="+name);
        }
    }
    public InnterClass01 getInnterClass01(){
        return  new InnterClass01();
    }
    public void useInnerClass(){
        InnterClass01 i1=new InnterClass01();
        i1.print();
    }
}


