package Chapter3.stack_50;


/**
 * @ClassName SetValueThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 16:50
 */
public class SetValueThread extends Thread {
    private SetService service;

    SetValueThread(SetService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        while(true){
            service.setMethod();

        }
    }
}
