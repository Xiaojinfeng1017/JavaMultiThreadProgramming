package Chapter1;

/**
 * @ClassName Saemon
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 13:43
 */
public class Saemon extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try{
            while(true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            Saemon saemon = new Saemon();
            saemon.setDaemon(true);//设置为守护线程且必须在start之前设置
            saemon.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，停止了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
