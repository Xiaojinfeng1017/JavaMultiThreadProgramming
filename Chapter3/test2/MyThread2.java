package Chapter3.test2;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @ClassName Thread2
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 11:07
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("结束notify "+ System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify " + System.currentTimeMillis());
        }
    }
}
