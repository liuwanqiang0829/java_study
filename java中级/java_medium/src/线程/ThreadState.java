package 线程;

/**
 * @author 刘万强~
 * @version 1.0
 **/
public class ThreadState {
    public static void main(String[] args) {
        State state=new State();
        System.out.println(state.getName()+"线程的状态是"+state.getState());
        state.start();
        while(Thread.State.TERMINATED!=state.getState()){
            System.out.println(state.getName()+"线程的状态是"+state.getState());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(state.getName()+"线程的状态是"+state.getState());
    }
}
class State extends Thread{
    int count=0;
    @Override
    public void run() {
        while(count<2){
            count++;
            System.out.println(Thread.currentThread().getName()+"正在执行~");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
