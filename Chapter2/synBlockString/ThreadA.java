package Chapter2.synBlockString;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 17:34
 */
public class ThreadA extends Thread{
    private Service service;

    ThreadA(Service service){
        super();
        this.service = service;
    }

    public void run(){
        service.setUsernamePassword("a","aa");
    }

}
