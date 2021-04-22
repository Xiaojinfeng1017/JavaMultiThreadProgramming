package Chapter3.ThreadLocalExt;

/**
 * @ClassName Main
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 8:57
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal threadLocal = new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return "我是默认值";
            }
        };
        ThreadA threadA = new ThreadA(threadLocal);
        ThreadB threadB = new ThreadB(threadLocal);
        threadA.start();
        threadB.start();
        for(int i=0;i<5;i++){
            System.out.println("main get "+threadLocal.get());

            threadLocal.set("main"+(i+1));
            Thread.sleep(1000);
        }

    }
}
