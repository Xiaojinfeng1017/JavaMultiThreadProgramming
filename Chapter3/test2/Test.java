package Chapter3.test2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 11:07
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread1 thread1 = new MyThread1(lock);
        thread1.start();
        Thread.sleep(2000);
        MyThread2 thread2 = new MyThread2(lock);
        thread2.start();
    }

}
