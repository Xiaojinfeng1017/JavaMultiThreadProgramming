package Chapter4.Fair_noFair_test;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/22 16:45
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService(false);//公平锁
        MyThread[] arrayA = new MyThread[10];
        MyThread[] arrayB = new MyThread[10];

        for(int i=0;i<10;i++){
            arrayA[i] = new MyThread(service);
            arrayA[i].setName("arrayA "+(i+1));
        }
        for(int i=0;i<10;i++){
            arrayA[i].start();
        }
        for(int i=0;i<10;i++){
            arrayB[i] = new MyThread(service);
            arrayB[i].setName("arrayB "+(i+1));
        }
     //   Thread.sleep(500);

        for(int i=0;i<10;i++){
            arrayB[i].start();
        }
    }
}
