package Chapter7;

/**
 * @ClassName Main3
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/24 8:43
 */
public class Main3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程 "+t.getName()+" 出现异常 ");
                e.printStackTrace();
            }
        });
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
