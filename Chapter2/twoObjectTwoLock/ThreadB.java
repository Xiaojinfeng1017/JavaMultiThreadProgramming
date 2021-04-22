package Chapter2.twoObjectTwoLock;

/**
 * @ClassName ThreadB
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 14:48
 */
public class ThreadB extends Thread{
    private hasSelfPrivateNum numRef;

    public ThreadB(hasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
