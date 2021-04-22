package Chapter3.waitOld;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 18:27
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA t1 = new MyThreadA(service);//add
        MyThreadB t3 = new MyThreadB(service);//substract
        MyThreadB t4 = new MyThreadB(service);//substract

        t3.start();
        t4.start();
        Thread.sleep(1000);
        t1.start();
    }

}
