package Chapter3.InheritableThreadLocal3;


/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 11:01
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

                System.out.println("ThreadA中的值  "+threadLocal.get());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
