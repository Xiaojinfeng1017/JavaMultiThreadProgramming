package Chapter3.waitOld;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 18:15
 */
public class Service {
    public List<Integer>list = new ArrayList<>();

    public void add(){
        synchronized (list){
            list.add(new Random().nextInt());
            list.notifyAll();
        }
    }

    public void substract(){
        try{
            synchronized (list){
                while(list.size() == 0){
                    System.out.println("进入wait");
                    list.wait();
                    System.out.println("结束wait");
                }
                list.remove(0);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
