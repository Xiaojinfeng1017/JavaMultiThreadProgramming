package Chapter3.stack_10;

/**
 * @ClassName CThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 19:52
 */
public class CThread extends Thread{
    private  Service service;

    CThread(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        while(true){
            service.removeElem();
        }
    }
}
