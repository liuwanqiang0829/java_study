package 接口.interface02;

public class InterfacePolyParameter {
    public static void main(String[] args) {
//        接口的多态的体现，接口类型的变量可以指向实现接口的类的实例

        polyInterface a1=new AA();
        polyInterface[] arr=new polyInterface[3];
        arr[0]=a1;
        arr[1]=new BB();
//  polyInterface02继承了polyInterface的接口，
//  所以polyInterface类型的数组可以添加polyInterface02类的对象，也即是多态传递
        arr[2]=new CC();
        for(int i=0;i<arr.length;i++){
//            此时想要调用arr中有work方法的对象
//            instanceof判断的是运行类型
            if(arr[i] instanceof polyInterface01){
//                向下转型
                ((polyInterface01)arr[i]).work();
            }
        }

    }
}
interface polyInterface{
    String value="接口的变量";
    void call();
}
interface polyInterface01{
    void work();
}
//接口的多态传递现象
interface polyInterface02 extends polyInterface{
    void print ();
}

class AA implements polyInterface,polyInterface01{
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void work() {
        System.out.println("开始工作");
    }
}
class BB implements polyInterface{
    @Override
    public void call() {
        System.out.println("打电话");
    }
}

class CC implements polyInterface02{
    public String value="CC类的变量";
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void print() {
        System.out.println("打印");
    }
}
class DD extends CC{
    public void getValue(){
        System.out.println("访问父类的变量使用super"+super.value);
        System.out.println("访问接口的变量使用接口名.变量名"+polyInterface.value);
    }
}

