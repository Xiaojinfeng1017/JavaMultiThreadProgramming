package Chapter4.Fair_noFair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 16:41
 */
public class MyService {
    private Lock lock;

    public MyService(boolean fair){
        lock = new ReentrantLock(fair);
    }

    public void testMethod(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);//这里的暂停是配合main方法中的500ms让array2有机会在非公平的情况下抢到锁。
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
