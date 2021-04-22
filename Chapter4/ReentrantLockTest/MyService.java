package Chapter4.ReentrantLockTest;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 13:21
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        lock.lock();
        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " "+ (i+1));
        }
        lock.unlock();
    }
}
