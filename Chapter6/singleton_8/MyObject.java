package Chapter6.singleton_8;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 20:49
 */
public class MyObject {
    private static MyObject instance = null;
    private MyObject(){

    }

    static {
        instance = new MyObject();
    }
    public static MyObject getInstance(){
        return instance;
    }
}
