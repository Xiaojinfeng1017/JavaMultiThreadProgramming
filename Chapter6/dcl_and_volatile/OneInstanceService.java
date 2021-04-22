package Chapter6.dcl_and_volatile;

import java.util.Random;

/**
 * @ClassName OneInstanceService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 17:05
 */
public class OneInstanceService {
    public int i_am_has_state = 0;

    private static volatile OneInstanceService test;

    private OneInstanceService(){
        i_am_has_state = new Random().nextInt(200) +1;
    }

    public static OneInstanceService getTest(){
        if(test == null){
            synchronized (OneInstanceService.class){
                if(test == null){
                    test = new OneInstanceService();
                }
            }
        }
        return test;
    }
    public static void reset(){
        test = null;
    }
}

