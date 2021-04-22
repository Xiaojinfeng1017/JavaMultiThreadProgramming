package Chapter4.ReentrantLock_end;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 9:14
 */
public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private String username = "abc";

    public void testMethod1(){
        try{
            lock.readLock().lock();
            System.out.println("begin "+System.currentTimeMillis());
            System.out.println("print service " + username);
            Thread.sleep(4000);
            System.out.println("end "+System.currentTimeMillis());
            lock.readLock().lock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
