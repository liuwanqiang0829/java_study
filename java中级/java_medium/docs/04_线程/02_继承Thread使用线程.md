## 线程的使用

### Thread的使用
继承关系：Thread->Runnable->FunctionalInterface
继承Thread类的类,默认就是线程类
```java
class Cat extends Thread{
    @Override
    public void run(){
        System.out.println("小猫喵喵叫~");
//        让该线程休眠一秒快捷键：ctrl+alt+t
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
```
cat类为线程类，之后使用start方法表示开启线程，之后会执行run方法
```java
public class ThreadMethods {
    public static void main(String[] args) {
          Cat cat=new Cat();
          cat.start();//表示启动线程,之后会执行run方法
    }
}
```

原理解析：
main方法会开启一个进程,进程会创建一个主线程main,main线程会开启子线程，然后会执行里面的子线程，
直到所有的线程执行完成才将进程执行完成
使用JConsole可以实时监测线程执行的情况
其中需要使用start方法才能开启新线程。run方法就是一个普通的方法，并不会开启新线程

start执行的时候，会执行一个本地方法start0(c/c++实现的),这是jvm调用的方法，是实现开启新线程的底层方法
注意：start方法调用start0放大后，该线程不会立即执行，只是将线程变成了可运行的状态。具体什么时候执行取决于
CPU，由cpu统一调度

### Runnable接口创建线程
java是单继承的，在某些情况下一个类已经继承了某个父类，这是再使用继承Thread类方法来创建线程已经不可能了
java的设计者们提供了另外一种方式创建线程，就是通过Runnable接口创建线程
```java
class Father{
    
}
class Child extends Father implements Runnable {
    int count=0;
    @Override
    public void run() {
        while(count<20){
            System.out.println("子线程执行了~"+Thread.currentThread().getName());
            try{
//                休眠一秒
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("异常=="+e);
            }
        }
       
    }
}
```

但是此时不能使用start方法开启线程，而是将实现的Runnable接口的类作为Thread类的参数创建Thread对象，
```java
public class RunnableCreateThread {
    public static void main(String[] args) {

        Child child=new Child();
        Thread thread=new Thread(child);
        thread.start();
    }
}
```
实现原理：底层采用代理模式实现new Thread(child)参数child传递进去之后调用对象


继承Thread和实现Runnable接口多线程的区别：
1. 从本质上说没有区别，因为Thread类本身就继承了Runnable接口
2. 实现Runnable接口的方式更加适合多个线程共享一个资源的情况，并且避免了单继承的限制



### 多线程的使用
```java
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
```
当开启main主线程创建多个子线程之后，子线程之间会开始交替执行

### 通知线程退出
线程终止-通知方式：如果线程中存在循环执行的情况，会先在执行的类中定义一个静态变量，当循环执行的时候会先通过
变量判断该循环是否继续执行，当主线程中将该变量的执行条件改为false之后就会终止该子线程的执行
1. 当线程完成任务之后会自动退出
2. 还可以通过使用变量来控制run方法退出的方式停止线程，即通知方式


```java
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

```

