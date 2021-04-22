package Chapter7.groupAddThread;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 22:25
 */
public class Run {
    public static void main(String[] args) {
        ThreadA arunnable = new ThreadA();
        ThreadB brunnable = new ThreadB();
        ThreadGroup threadGroup = new ThreadGroup("xjf");
        Thread thread1 = new Thread(threadGroup,arunnable);
        Thread thread2 = new Thread(threadGroup,brunnable);
        thread1.start();
        thread2.start();
        System.out.println("活动的线程数："+threadGroup.activeCount());
        System.out.println("线程组的名称："+threadGroup.getName());
    }
}
