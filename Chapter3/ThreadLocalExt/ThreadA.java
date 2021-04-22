package Chapter3.ThreadLocalExt;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 8:54
 */
public class ThreadA extends Thread{

    private ThreadLocal threadLocal;
    ThreadA(ThreadLocal threadLocal){
        super();
        this.threadLocal = threadLocal;
    }
    @Override
    public void run() {
        try{
            for(int i = 0;i<5;i++){
                System.out.println("A get "+threadLocal.get());

                threadLocal.set("A"+(i+1));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
