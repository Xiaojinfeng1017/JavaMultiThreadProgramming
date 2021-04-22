package Chapter1.priority;

import java.util.Random;

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 12:00
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for(int j = 0;j<10;j++){
            for(int i = 0;i<500000;i++){
                Random random = new Random();
                random.nextInt();
                addResult += addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("@@@@@@@@  thread2 use time"+(endTime-beginTime));
    }
}
