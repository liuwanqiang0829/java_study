package 内部类;

public class StaticClass {
    public static void main(String[] args) {
//        第一种方式(但是必须要考虑权限问题)
        Outer03.Inner03 i3=new Outer03.Inner03();
        i3.print();
//        第二种方式(返回内部类实例的访问)
        Outer03.Inner03 i4=new Outer03().getInner03();
        i4.print();
        Outer03.Inner03 i5=Outer03.getInnerbyStatic();
        i5.print();
    }
}

class Outer03{
    public static String name="外部类的静态成员";
    public String value="普通成员";
//    静态内部类
   public static class Inner03{
        public void print(){
            System.out.println("静态内部类~~"+"访问外部类的静态变量"+name+"访问外部普通成员="+Outer03.name);
        }
    }
    public Inner03 getInner03(){
       return  new Inner03();
    }
    public  static Inner03  getInnerbyStatic(){
       return new Inner03();
    }
}