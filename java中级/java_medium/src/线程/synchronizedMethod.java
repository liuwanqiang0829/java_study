package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class synchronizedMethod {
    public static void main(String[] args) {
        SellTicket sellTicket=new SellTicket();
        SellTicket sellTicket1=new SellTicket();
        SellTicket sellTicket2=new SellTicket();
        SellTicket sellTicket3=new SellTicket();
        SellTicket sellTicket4=new SellTicket();
        SellTicket sellTicket5=new SellTicket();
        SellTicket sellTicket6=new SellTicket();
        SellTicket sellTicket7=new SellTicket();
        SellTicket sellTicket8=new SellTicket();
        SellTicket sellTicket9=new SellTicket();
        SellTicket sellTicket10=new SellTicket();
        SellTicket sellTicket11=new SellTicket();
        sellTicket.start();
        sellTicket1.start();
        sellTicket2.start();
        sellTicket3.start();
        sellTicket4.start();
        sellTicket5.start();
        sellTicket6.start();
        sellTicket7.start();
        sellTicket8.start();
        sellTicket9.start();
        sellTicket10.start();
        sellTicket11.start();
    }
}

class SellTicket extends Thread{
    private static int num=80;
    public int testValue=20;

    @Override
    public  void run() {
//      while(num>0){
//          sell();
//      }
        while(testValue>0){
            codeBlock();
        }
    }
    //给方法加上同步标识
    public synchronized void sell(){
        if(num<=0){
            System.out.println("电影票已经售罄");
            return;
        }
        testValue--;
        System.out.println("剩余电影票还有"+testValue+"张");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
//    给代码块添加同步标识
    public void codeBlock(){
            if(testValue<=0){
                System.out.println("电影票已经售罄");
                System.out.println("testValue=="+testValue);
                return;
            }
            testValue--;
            System.out.println("剩余电影票还有"+testValue+"张");
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU cores: " + processors);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //给静态方法加互斥锁
    public static void staticMethod(){
        synchronized (SellTicket.class){
            System.out.println("静态方法中给代码块添加互斥锁");
        }
    }
}
