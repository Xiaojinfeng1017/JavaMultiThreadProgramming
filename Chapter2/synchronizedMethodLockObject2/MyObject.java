package Chapter2.synchronizedMethodLockObject2;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 15:02
 */
public class MyObject {

    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("endTime=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try{
            System.out.println("begin methodB threadName = "+Thread.currentThread().getName()+
            " begin time ="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("endTime=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
