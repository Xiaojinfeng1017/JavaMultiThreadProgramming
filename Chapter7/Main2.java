package Chapter7;


/**
 * @ClassName Main2
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 23:02
 */
public class Main2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("t1");
        myThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程"+t.getName()+"出现异常");
                e.printStackTrace();
            }
        });
        myThread.start();

    }
}
