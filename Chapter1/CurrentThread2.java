package Chapter1;

/**
 * @ClassName CurrentThread2
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 10:34
 */
public class CurrentThread2 extends Thread {
    CurrentThread2(){
        System.out.println("构造函数开始");
        System.out.println("Thread.CurrentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+ this.getName());
        System.out.println("构造函数结束");
    }

    @Override
    public void run() {
        System.out.println("run函数开始");
        System.out.println("Thread.CurrentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+ this.getName());
        System.out.println("run函数结束");
    }

    public static void main(String[] args) {
        CurrentThread2 currentThread2 = new CurrentThread2();
        Thread t1 = new Thread(currentThread2);
        t1.setName("A");
        t1.start();
    }
}
