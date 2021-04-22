package Chapter6.singleton_1;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 14:56
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){

    }

    public synchronized static MyObject getInstance(){
        if (myObject == null) myObject = new MyObject();
        return myObject;
    }
}
