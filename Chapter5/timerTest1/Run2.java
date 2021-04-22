package Chapter5.timerTest1;

import java.util.Date;
import java.util.Timer;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 10:54
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间是："+nowTime);

        long scheduleTime = nowTime + 10000;
        System.out.println("计划时间为："+scheduleTime);

        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask,new Date(scheduleTime));
        Thread.sleep(10000);
        timer.cancel();
        System.out.println("main线程结束");
    }
}
