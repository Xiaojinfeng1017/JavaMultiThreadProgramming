package Chapter4.condition123;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 8:57
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        for(int i = 0;i<5;i++){
            ThreadA a = new ThreadA(service);
            a.start();
            ThreadB b = new ThreadB(service);
            b.start();
            ThreadC c = new ThreadC(service);
            c.start();
        }
    }
}
