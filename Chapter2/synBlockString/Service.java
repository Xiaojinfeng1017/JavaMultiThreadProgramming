package Chapter2.synBlockString;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 17:34
 */
public class Service {
    private String username;
    private String password;

    //private
    public void setUsernamePassword(String username,String password){
        try{
            String anything = new String();
            synchronized (anything){
                System.out.println("线程名称为 "+Thread.currentThread().getName()
                        +" 在 "+System.currentTimeMillis()+" 进入同步块");
                this.username = username;
                Thread.sleep(3000);
                this.password = password;
                System.out.println("线程名称为 "+Thread.currentThread().getName()
                        +" 在 "+System.currentTimeMillis()+" 离开同步块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
