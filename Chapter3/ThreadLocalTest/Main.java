package Chapter3.ThreadLocalTest;

/**
 * @ClassName Main
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 8:57
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal threadLocal = new ThreadLocal();
        ThreadA threadA = new ThreadA(threadLocal);
        ThreadB threadB = new ThreadB(threadLocal);
        threadA.start();
        threadB.start();
        for(int i=0;i<5;i++){
            threadLocal.set("main"+(i+1));
            System.out.println("main get "+threadLocal.get());
            Thread.sleep(1000);
        }

    }
}
