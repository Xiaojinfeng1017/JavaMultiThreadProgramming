package Chapter4.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 8:52
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    volatile private int nextWhoPrint = 1;

    public void testMethod(){
        try{
            lock.lock();
            while(nextWhoPrint != 1){
                condition.await();
            }
            System.out.println("AAA");
            nextWhoPrint = 2;
            condition.signalAll();
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void testMethod2(){
        try{
            lock.lock();
            while(nextWhoPrint != 2){
                condition.await();
            }
            System.out.println("   BBB");
            nextWhoPrint = 3;
            condition.signalAll();
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethod3(){
        try{
            lock.lock();
            while(nextWhoPrint != 3){
                condition.await();
            }
            System.out.println("      CCC");
            nextWhoPrint = 1;
            condition.signalAll();
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
