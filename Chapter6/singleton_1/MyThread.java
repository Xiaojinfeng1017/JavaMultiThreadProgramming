package Chapter6.singleton_1;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 14:58
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode() + "  "+Thread.currentThread().getName());
    }
}
