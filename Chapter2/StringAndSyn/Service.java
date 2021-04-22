package Chapter2.StringAndSyn;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 21:58
 */
public class Service {
    public static void print(String stringParam){
        try{
            synchronized (stringParam){
                while(true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
