package Chapter4.condition123;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 8:56
 */
public class ThreadC extends Thread {
    private MyService service;

    public ThreadC(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod3();
    }
}
