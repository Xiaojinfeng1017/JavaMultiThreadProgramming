package Chapter3.ThreadLocalExt;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 8:54
 */
public class ThreadB extends Thread{

    private ThreadLocal threadLocal;
    ThreadB(ThreadLocal threadLocal){
        super();
        this.threadLocal = threadLocal;
    }
    @Override
    public void run() {
        try{
            for(int i = 0;i<5;i++){
                System.out.println("B get "+threadLocal.get());
                threadLocal.set("B"+(i+1));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
