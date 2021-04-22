package Chapter2.synTwoLock;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 20:14
 */
public class ThreadC extends Thread{
    private Service service;
    public ThreadC(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
