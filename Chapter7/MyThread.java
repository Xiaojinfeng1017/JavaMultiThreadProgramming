package Chapter7;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 23:03
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
