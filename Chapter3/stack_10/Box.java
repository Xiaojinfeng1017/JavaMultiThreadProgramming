package Chapter3.stack_10;

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
        list.add(new Random().nextInt());
    }

    synchronized public void remove(){
        list.remove(0);
    }
    synchronized public int size(){
        return list.size();
    }
}
