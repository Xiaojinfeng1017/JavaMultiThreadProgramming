package Chapter3.InheritableThreadLocal3;


/**
 * @ClassName Mian
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 11:01
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        InheritableThreadLocal threadLocal = new InheritableThreadLocal(){
            @Override
            protected Object childValue(Object parentValue) {
                return parentValue+"子线程后缀";
            }
        };
        for(int i=0;i<5;i++){
            threadLocal.set("xjf");
            System.out.println("Main线程中 "+ threadLocal.get());
        }
        ThreadA threadA = new ThreadA(threadLocal);
        threadA.start();
        Thread.sleep(2000);
    }

}
