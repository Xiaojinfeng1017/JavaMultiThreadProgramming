package Chapter2.synchronizedMethodLockObject2;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 14:48
 */
public class ThreadA extends Thread{
    private MyObject object;

    public ThreadA(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
