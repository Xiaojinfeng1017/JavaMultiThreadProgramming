package Chapter2.setNewStringTwoLock;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 10:07
 */
public class ThreadA extends Thread {
    private MyService myService;

    ThreadA(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
