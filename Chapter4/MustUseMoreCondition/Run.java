package Chapter4.MustUseMoreCondition;



/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 11:19
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();

        Thread.sleep(3000);
        System.out.println("三秒后signalAll_A");
        service.signalAll_A();

    }
}
