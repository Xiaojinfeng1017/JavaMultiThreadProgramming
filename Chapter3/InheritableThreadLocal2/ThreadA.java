package Chapter3.InheritableThreadLocal2;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 11:01
 */
public class ThreadA extends Thread{

    private InheritableThreadLocal<User> threadLocal;
    ThreadA(InheritableThreadLocal threadLocal){
        super();
        this.threadLocal = threadLocal;
    }

    @Override
    public void run() {
        try{
            for(int i = 0;i<5;i++){
                User user = threadLocal.get();
                System.out.println("ThreadA中的值  "+user.getUsername());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
