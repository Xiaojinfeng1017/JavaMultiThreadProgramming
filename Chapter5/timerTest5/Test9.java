package Chapter5.timerTest5;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName Test9
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 14:35
 */
public class Test9 {
    static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("begin timer = "+System.currentTimeMillis());
            System.out.println("end timer = "+System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        long nowTime = System.currentTimeMillis();
        System.out.println("nowTime = "+System.currentTimeMillis());
        long runTime = nowTime - 10000;
        System.out.println("runTime = "+runTime);
        Timer timer = new Timer();
        timer.schedule(myTask,new Date(runTime),2000);
    }

}
