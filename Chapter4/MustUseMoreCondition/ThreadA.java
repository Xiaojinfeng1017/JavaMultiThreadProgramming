package Chapter4.MustUseMoreCondition;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 11:18
 */
public class ThreadA extends Thread {
    private MyService service;

    ThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
