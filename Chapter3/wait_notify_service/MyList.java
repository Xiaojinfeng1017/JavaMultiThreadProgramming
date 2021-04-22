package Chapter3.wait_notify_service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyList
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 17:10
 */
public class MyList {
    volatile private List<Integer> list = new ArrayList();

    public void add(int data){
        list.add(data);
    }
    public int size(){
        return list.size();
    }
}
