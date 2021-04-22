package Chapter2.synchronizedMethodLockObject2;


/**
 * @ClassName ThreadB
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 14:48
 */
public class ThreadB extends Thread{
    private MyObject object;

    public ThreadB(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
