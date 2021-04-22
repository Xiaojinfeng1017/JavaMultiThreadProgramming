package Chapter2.setNewStringTwoLock;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 10:08
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");

        threadA.start();
       // Thread.sleep(50);//存在50ms
        threadB.start();
    }
}
