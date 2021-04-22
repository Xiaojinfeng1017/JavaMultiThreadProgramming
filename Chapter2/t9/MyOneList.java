package Chapter2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyOneList
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 19:06
 */
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    };

    synchronized public int getSize(){
        return list.size();
    }
}
