package Chapter3.wait_notify_insert_test;

import Chapter3.pipeInputOutput.InputAndOutput;

import java.io.PipedWriter;

/**
 * @ClassName DBTools
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:31
 */
public class DBTools {
    private boolean prevIsA = false;

    synchronized public void backupA(){
        try{
            while(prevIsA == true){
                wait();
            }
            System.out.println("********");
            prevIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

    synchronized public void backupB(){
        try{
            while(prevIsA == false){
                wait();
            }
            System.out.println("$$$$$$");
            prevIsA = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
