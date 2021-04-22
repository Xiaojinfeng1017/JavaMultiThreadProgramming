package Chapter4.ReentrantLock_end;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 9:16
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.testMethod1();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.start();

    }
}
