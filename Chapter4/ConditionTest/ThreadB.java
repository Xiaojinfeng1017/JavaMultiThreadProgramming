package Chapter4.ConditionTest;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 11:18
 */
public class ThreadB extends Thread {
    private MyService service;

    ThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        while(true)
           service.getValue();
    }
}
