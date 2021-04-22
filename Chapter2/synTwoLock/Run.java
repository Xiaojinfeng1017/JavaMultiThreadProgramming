package Chapter2.synTwoLock;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 20:17
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
