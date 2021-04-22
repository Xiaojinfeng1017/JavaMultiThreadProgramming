package Chapter6.singleton_7_1;
import java.io.Serializable;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 20:24
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    public static Userinfo userinfo = new Userinfo();
    private static MyObject myObject = new MyObject();

    private MyObject(){

    }
    public static MyObject getInstance(){
        return myObject;
    }

    protected Object readResolve(){
        System.out.println("调用了readResolve方法");
        return MyObject.myObject;
    }
}
