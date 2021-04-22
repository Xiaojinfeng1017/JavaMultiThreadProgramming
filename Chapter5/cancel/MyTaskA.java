package Chapter5.cancel;

import java.util.TimerTask;

/**
 * @ClassName MyTaskA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 12:48
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer");

    }
}
