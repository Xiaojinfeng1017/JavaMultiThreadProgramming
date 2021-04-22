package Chapter3.test2;

/**
 * @ClassName MyThread1
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 11:07
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                System.out.println("开始wait  "+System.currentTimeMillis());
                lock.wait();
                System.out.println("结束wait  "+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
