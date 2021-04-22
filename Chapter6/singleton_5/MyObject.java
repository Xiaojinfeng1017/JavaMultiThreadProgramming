package Chapter6.singleton_5;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 16:35
 */
public class MyObject {
    private volatile static MyObject myObject;

    public static MyObject getInstance(){
        try{
            if(myObject != null){

            }else{
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if(myObject == null){
                        myObject = new MyObject();
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
