package Chapter5.cancel;

import Chapter5.timerTest1.MyTask;

import java.util.Date;
import java.util.Timer;

/**
 * @ClassName Test
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 12:49
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyTaskA myTaskA = new MyTaskA();
        MyTaskB myTaskB = new MyTaskB();
        MyTaskC myTaskC = new MyTaskC();
        Timer timer = new Timer();
        timer.schedule(myTaskA,new Date(System.currentTimeMillis()),4000);
        timer.schedule(myTaskB,new Date(System.currentTimeMillis()),4000);
        timer.schedule(myTaskC,new Date(System.currentTimeMillis()),4000);

        Thread.sleep(Integer.MAX_VALUE);
    }
}
