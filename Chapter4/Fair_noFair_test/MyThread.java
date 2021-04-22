package Chapter4.Fair_noFair_test;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 16:44
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
