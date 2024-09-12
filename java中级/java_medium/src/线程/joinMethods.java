package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class joinMethods {

    public static void main(String[] args) {;
        int times=0;
        Thread11 thread11=new Thread11();
        GuardThread guardThread=new GuardThread();
//        设置子线程为守卫线程
        guardThread.setDaemon(true);
        guardThread.start();
        thread11.start();

        while(times<20){
            times++;
            System.out.println(Thread.currentThread().getName()+"执行了"+times+"次");
            if(times==5){
                //                    插队执行优先执行
//                try {
//                    System.out.println("让子线程先执行~");
//                    thread11.join();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            礼让执行，当资源cpu不丰富的时候，空出自己cpu的资源让其他资源先执行
                Thread.yield();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread11 extends Thread{
    int times=0;
    @Override
    public void run() {
        while(times<20){
            times++;
            System.out.println(Thread.currentThread().getName()+"执行了"+times+"次");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class  GuardThread extends Thread{
    @Override
    public void run() {
        System.out.println("改造线程为守卫线程！");
        while(true){
            System.out.println("守卫线程会在主线程执行结束之后结束~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}