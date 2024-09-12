package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class killThread {
    public static void main(String[] args) {
        Th th = new Th();
        th.start();
//        主线程通知子线程停止执行
        th.setLoop(false);
    }
}
class Th extends Thread{
    private static int count=0;
    private  static  boolean loop=true;//设置loop给主线程main，让他控制程序的暂停
    @Override
    public void run() {
        while(loop){
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"运行了"+count+"次");
        }
    }
    public void setLoop(boolean loop){
        Th.loop=loop;
    }
}
