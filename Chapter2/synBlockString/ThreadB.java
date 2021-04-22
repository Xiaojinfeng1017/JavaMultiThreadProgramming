package Chapter2.synBlockString;

/**
 * @ClassName ThreadB
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 17:34
 */
public class ThreadB extends Thread{
    private Service service;

    ThreadB(Service service){
        super();
        this.service = service;
    }

    public void run(){
        service.setUsernamePassword("b","bb");
    }

}
