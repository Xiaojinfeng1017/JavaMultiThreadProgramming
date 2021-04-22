package Chapter2.synTwoLock;

import java.io.Serializable;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 20:14
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
