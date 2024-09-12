package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class RunnableCreateThread {
    public static void main(String[] args) {

        Child child=new Child();
        Thread thread=new Thread(child);
        thread.start();
    }
}


class Father{

}
class Child extends Father implements Runnable {
    int count=0;
    @Override
    public void run() {
        while(count<20){
            count++;
            System.out.println(Thread.currentThread().getName()+"子线程执行了"+count+"次");

            try{
//                休眠一秒
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("异常=="+e);
            }
        }

    }
}


//实现一个Thread类代理实现runnable和实现开启线程
class ThreadProxy implements Runnable{
    private Runnable target=null;
    @Override
    public void run() {
        if(this.target!=null){
            this.target.run();
        }
    }
    public ThreadProxy(Runnable target){
        this.target=target;
    }
    public void  start(){
        start0();
    }
//    start0模拟java原生的方法
    public void start0(){
        run();
    }
}

