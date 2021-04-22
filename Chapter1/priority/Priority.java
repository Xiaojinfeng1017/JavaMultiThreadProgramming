package Chapter1.priority;

/**
 * @ClassName Priority
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 11:55
 */
public class Priority {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(10);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(1);
            thread2.start();
        }
    }
}



