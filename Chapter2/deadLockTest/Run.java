package Chapter2.deadLockTest;

import Chapter2.StringAndSyn.ThreadA;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 22:23
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        DealThread dealThread = new DealThread();
        dealThread.setFlag("a");
        Thread thread1 = new Thread(dealThread);
        thread1.start();

        Thread.sleep(100);
        dealThread.setFlag("b");
        Thread thread2 = new Thread(dealThread);
        thread2.start();
    }
}
