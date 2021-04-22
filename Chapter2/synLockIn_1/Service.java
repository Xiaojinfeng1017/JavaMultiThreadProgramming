package Chapter2.synLockIn_1;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 16:11
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}
