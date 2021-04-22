package Chapter5.timerTest1;

import java.util.TimerTask;

/**
 * @ClassName MyTask
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 10:52
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行时间:"+System.currentTimeMillis());
    }
}
