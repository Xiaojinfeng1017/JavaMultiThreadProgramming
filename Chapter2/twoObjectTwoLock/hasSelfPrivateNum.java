package Chapter2.twoObjectTwoLock;

/**
 * @ClassName twoObjectTwoLock
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 14:41
 */
public class hasSelfPrivateNum {
    private int num = 0;
    synchronized public void addI(String username){
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username+" num= "+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
