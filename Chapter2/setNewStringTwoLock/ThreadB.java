package Chapter2.setNewStringTwoLock;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 10:07
 */
public class ThreadB extends Thread {
    private MyService myService;

    ThreadB(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
