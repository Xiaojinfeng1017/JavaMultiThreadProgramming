package Chapter6.dcl_and_volatile;

import sun.reflect.generics.tree.SimpleClassTypeSignature;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName Test
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 17:09
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (; ; ) {
            CountDownLatch latch = new CountDownLatch(1);
            CountDownLatch end = new CountDownLatch(100);
            for (int i = 0; i < 100; i++) {
                Thread t1 = new Thread() {
                    @Override
                    public void run() {
                        try {
                            latch.await();

                            OneInstanceService one = OneInstanceService.getTest();
                            if (one.i_am_has_state == 0) {//等于0说明没有经过构造器
                                System.out.println("one.i_am_has_state == 0进程结束");
                                System.exit(0);
                            }
                            end.countDown();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                t1.start();
            }
            latch.countDown();
            end.await();
            OneInstanceService.reset();

        }
    }
}
