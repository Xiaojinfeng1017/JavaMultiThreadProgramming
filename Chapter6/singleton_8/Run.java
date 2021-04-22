package Chapter6.singleton_8;

import Chapter5.timerTest1.MyTask;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 20:52
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();

    }
}
