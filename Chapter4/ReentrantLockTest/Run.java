package Chapter4.ReentrantLockTest;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 13:24
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        for(int i=0;i<5;i++){
            MyThread myThread = new MyThread(service);
            myThread.start();
        }
    }
}
