package Chapter3.stack_50;

import javax.swing.table.TableCellRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName Box
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 20:32
 */
public class Box {
    private List<Integer> list = new ArrayList<>();

    synchronized public void add(){
        if(size() < 10){
            list.add(new Random().nextInt());
            System.out.println(Thread.currentThread().getName()+"执行add，size是"+list.size());
        }

    }

    synchronized public void remove() {
        list.remove(0);
        System.out.println(Thread.currentThread().getName()+"执行remove，size是"+list.size());
    }
    synchronized public int size(){
        return list.size();
    }
}
