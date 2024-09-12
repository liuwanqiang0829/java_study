package 接口.interface01;

public interface USBInterface {
    String name="接口中的属性默认就是final,public,static";
    public  static  void staticMethod(){
        System.out.println("可以实现静态方法");
    }
//    接口中实现的普通方法都是抽象方法，可以不用abstract修饰
    public void start();
    public void end();
    default public void defaultMethod(){
        System.out.println("default修饰的方法也可以有方法体");
    }
}
