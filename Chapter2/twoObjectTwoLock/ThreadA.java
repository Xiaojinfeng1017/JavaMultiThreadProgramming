package Chapter2.twoObjectTwoLock;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 14:48
 */
public class ThreadA extends Thread{
    private hasSelfPrivateNum numRef;

    public ThreadA(hasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
