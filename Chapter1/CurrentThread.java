package Chapter1;

/**
 * @ClassName CurrentThread()方法的使用
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 10:30
 */
public class CurrentThread extends Thread{
    public CurrentThread(){
        System.out.println("构造方法的打印："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印："+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        CurrentThread currentThread = new CurrentThread();
        currentThread.start();
    }
}
