package Chapter2;


/**
 * @ClassName Test1
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 16:30
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("A "+Thread.currentThread().holdsLock(Test1.class));// false
        synchronized (Test1.class){
            System.out.println("B "+Thread.currentThread().holdsLock(Test1.class));// true
        }
        System.out.println("C "+Thread.currentThread().holdsLock(Test1.class));// false
    }
}
