package Chapter3.p_r_test;

import java.util.Random;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 19:51
 */
public class Service {
    private String  str = "";
    private Object lock = new Object();
    public void setValue(){
        try{
            synchronized (lock){
                while(!str.equals("")){
                    lock.wait();
                }
                str = "set new string";
                System.out.println("set方法 string = " +str);
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void getValue(){
        try{
            synchronized (lock){
                while(str.equals("")){
                    lock.wait();
                }
                str = "";
                System.out.println("get方法 string = " +str);
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
