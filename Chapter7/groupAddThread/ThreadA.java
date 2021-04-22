package Chapter7.groupAddThread;

import java.util.Optional;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 22:22
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName= "+Thread.currentThread().getName());
                Thread.sleep(3000);

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
