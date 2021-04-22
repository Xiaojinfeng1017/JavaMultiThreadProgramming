package Chapter3.InheritableThreadLocal1;

/**
 * @ClassName Main
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 8:57
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        InheritableThreadLocal threadLocal = new InheritableThreadLocal();


        for(int i=0;i<5;i++){
            threadLocal.set("main线程放入的值"+(i+1));
            System.out.println("main get "+threadLocal.get());
            Thread.sleep(1000);
        }
        //要在创建之前就set方法赋值
        ThreadA threadA = new ThreadA(threadLocal);
        ThreadB threadB = new ThreadB(threadLocal);
        threadA.start();
        threadB.start();
        threadLocal.set("main线程创建线程后放入的值");
        System.out.println("main get "+threadLocal.get());

    }
}
