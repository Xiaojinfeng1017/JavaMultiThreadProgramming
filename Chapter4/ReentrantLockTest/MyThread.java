package Chapter4.ReentrantLockTest;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 13:23
 */
public class MyThread extends Thread {
    private MyService myService;

    MyThread(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}

