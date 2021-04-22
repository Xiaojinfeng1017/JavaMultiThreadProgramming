package Chapter3.p_r_test;

/**
 * @ClassName PThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 19:52
 */
public class PThread extends Thread{
    private  Service service;

    PThread(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        while(true){
            service.setValue();
        }
    }
}