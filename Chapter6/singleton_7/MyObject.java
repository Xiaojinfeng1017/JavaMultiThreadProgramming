package Chapter6.singleton_7;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 18:04
 */
public class MyObject {
    //静态内部类
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();

    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
