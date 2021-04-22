package Chapter2.synTwoLock;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 19:48
 */
public class Service {

    synchronized public static void printA() {
        try {
            System.out.println("线程名称是 " + Thread.currentThread().getName()
                    + " 在 " + System.currentTimeMillis() + " 进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称是 " + Thread.currentThread().getName()
                    + " 在 " + System.currentTimeMillis() + " 离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("线程名称是 " + Thread.currentThread().getName()
                + " 在 " + System.currentTimeMillis() + " 进入printB");
        System.out.println("线程名称是 " + Thread.currentThread().getName()
                + " 在 " + System.currentTimeMillis() + " 离开printB");
    }

    synchronized public void printC() {
        System.out.println("线程名称是 " + Thread.currentThread().getName()
                + " 在 " + System.currentTimeMillis() + " 进入printC");
        System.out.println("线程名称是 " + Thread.currentThread().getName()
                + " 在 " + System.currentTimeMillis() + " 离开printC");
    }
}



