package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class multiThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("线程1");
        Thread2 thread2 = new Thread2("线程2");
         Thread threadStart1=new Thread(thread1);
         Thread threadStart2=new Thread(thread2);
         threadStart1.start();
         threadStart2.start();
    }
}
class Thread1 implements Runnable{
    int count=0;
    private String name;
    public Thread1(String name){
        this.name=name;
    }
    @Override
    public void run() {
        while(count<20){
            count++;
            System.out.println(this.name+"---"+Thread.currentThread().getName()+"的线程执行了"+count+"次");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }
}
class Thread2 implements Runnable{
    int count=0;
    private String name;
    public Thread2(String name){
        this.name=name;
    }
    @Override
    public void run() {
        while(count<20){

            count++;
            System.out.println(this.name+"---"+Thread.currentThread().getName()+"的线程执行了"+count+"次");

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}