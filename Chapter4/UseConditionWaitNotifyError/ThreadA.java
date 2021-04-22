package Chapter4.UseConditionWaitNotifyError;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 13:48
 */
public class ThreadA extends Thread{
    private MyService service;

    ThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
