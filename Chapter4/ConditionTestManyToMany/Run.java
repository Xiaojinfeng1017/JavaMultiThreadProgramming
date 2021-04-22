package Chapter4.ConditionTestManyToMany;


/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 11:19
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA[] threadA = new ThreadA[10];
        ThreadB[] threadB = new ThreadB[10];

        for(int i = 0;i<5;i++){
            threadA[i] = new ThreadA(service);
            threadB[i] = new ThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }

    }
}
