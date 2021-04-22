package Chapter6.singleton_8;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 20:51
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
