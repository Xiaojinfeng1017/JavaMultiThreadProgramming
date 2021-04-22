package Chapter3.InheritableThreadLocal1;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 8:54
 */
public class ThreadA extends Thread{

    private InheritableThreadLocal threadLocal;
    ThreadA(InheritableThreadLocal threadLocal){
        super();
        this.threadLocal = threadLocal;
    }
    @Override
    public void run() {
        try{
            for(int i = 0;i<5;i++){
              //  threadLocal.set("A"+(i+1));
                System.out.println("A get "+threadLocal.get());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
