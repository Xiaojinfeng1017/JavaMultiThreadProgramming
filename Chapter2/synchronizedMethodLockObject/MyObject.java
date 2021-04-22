package Chapter2.synchronizedMethodLockObject;

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
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
