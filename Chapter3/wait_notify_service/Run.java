package Chapter3.wait_notify_service;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 17:20
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA thread1 = new MyThreadA(service);
        thread1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThreadB thread2 = new MyThreadB(service);
        thread2.start();
    }
}
