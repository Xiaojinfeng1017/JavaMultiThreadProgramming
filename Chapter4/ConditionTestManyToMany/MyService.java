package Chapter4.ConditionTestManyToMany;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 16:06
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void setValue(){
        try{
            lock.lock();
            while (hasValue == true){
                condition.await();
            }
            hasValue = true;
            System.out.println("set value success");
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void getValue(){
        try{
            lock.lock();
            while(hasValue == false){
                condition.await();
            }
            hasValue = false;
            System.out.println("get value success");
            condition.signalAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
