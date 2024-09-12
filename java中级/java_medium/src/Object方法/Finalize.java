package Object方法;

public class Finalize {
    public static void main(String[] args) {
        Car bwm=new Car("宝马");
        System.gc();//主动调用垃圾回收器
        bwm=null;
    }
}
class Car{
    private String name;
    public  Car(String name){
        this.name=name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
