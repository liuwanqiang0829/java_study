package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("主线程的名称="+Thread.currentThread().getName());//,main
          Cat cat=new Cat();
          cat.start();//表示启动线程，之后会执行run方法
        cat.setPriority(Thread.MAX_PRIORITY);//设置优先级
        System.out.println("cat线程类的优先级="+cat.getPriority());
    }
}

//1.当一个类继承了Thread类，就表示这个类是一个线程，可以重写run方法，run方法是实现了Runnable接口的run方法

class Cat extends Thread{
    int times=0;
    @Override
    public void run(){


        while(true){
            //        让该线程休眠一秒快捷键：ctrl+alt+t
            try{
                System.out.println("小猫喵喵叫~");
                System.out.println("线程名称=="+Thread.currentThread().getName());
                ++times;
                System.out.println("猫线程执行的次数"+times);
                Thread.sleep(1000);
//                中断线程
//                InterruptedException中断异常，当使用线程的interrupt方法的时候就会发生中断
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName()+"线程被中断了~");
            }
            Thread.interrupted();
            if(times>20){
                break;
            }
        }

    }
}

