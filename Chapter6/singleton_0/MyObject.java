package Chapter6.singleton_0;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 14:56
 */
public class MyObject {
    private static MyObject myObject = new MyObject();
    private MyObject(){

    }

    public static MyObject getInstance(){
        return myObject;
    }
}
