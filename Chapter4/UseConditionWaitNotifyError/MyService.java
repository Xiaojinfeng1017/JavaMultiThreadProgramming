package Chapter4.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 13:48
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try{
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait end");
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void signal(){
        try{
            lock.lock();
            System.out.println("signal begin");
            condition.signal();
            System.out.println("signal end");
        }finally {
            lock.unlock();
        }
    }
}
