package Chapter2.setNewStringTwoLock;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 10:04
 */
public class MyService {
    private String lock = "123";
    public void testMethod(){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                lock = "456";//锁改变
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
