package Chapter5.timerTest5;

import java.beans.IntrospectionException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName MyTask
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 14:20
 */
public class Test{
    static class MyTask extends TimerTask {
        @Override
        public void run() {
            try{
                System.out.println("begin timer = "+System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end timer = "+System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        long nowTime = System.currentTimeMillis();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTask,new Date(nowTime),3000);
    }

}

