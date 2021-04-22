package Chapter3.wait_notify_service;


/**
 * @ClassName MyThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 17:18
 */
public class MyThreadB extends Thread{
    private Service service;

    public MyThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
