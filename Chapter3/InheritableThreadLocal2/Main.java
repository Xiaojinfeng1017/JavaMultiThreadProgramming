package Chapter3.InheritableThreadLocal2;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @ClassName Mian
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/20 11:01
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        InheritableThreadLocal<User> threadLocal = new InheritableThreadLocal();
        User user = new User();
        user.setUsername("xjf");
        for(int i=0;i<5;i++){
            threadLocal.set(user);
            System.out.println("Main线程中的user "+ user.getUsername());
        }
        ThreadA threadA = new ThreadA(threadLocal);
        threadA.start();
        Thread.sleep(2000);
        user.setUsername("xjfxjf");
        System.out.println("Main线程中的新user "+user.getUsername());
    }

}
