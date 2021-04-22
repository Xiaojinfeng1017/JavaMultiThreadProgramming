package Chapter2.twoObjectTwoLock;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 14:50
 */
public class Run {
    public static void main(String[] args) {
        hasSelfPrivateNum numRef1 = new hasSelfPrivateNum();//对象1
        hasSelfPrivateNum numRef2 = new hasSelfPrivateNum();//对象2

        ThreadA threadA = new ThreadA(numRef1);//线程1
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);//线程2 两个线程用的两个不同的对象，不存在争抢关系。
        threadB.start();
    }
}
