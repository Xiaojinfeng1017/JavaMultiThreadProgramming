package Chapter1;

/**
 * @ClassName YieldMethod
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 11:37
 */
public class YieldMethod  extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 0;i<50000000;i++){
            //Thread.yield();
            count = count +(i+1);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("用时"+(endTime-beginTime)+"毫秒");

    }

    public static void main(String[] args) {
        YieldMethod yieldMethod = new YieldMethod();
        yieldMethod.start();
    }
}
