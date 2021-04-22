package Chapter3.stack_50;

/**
 * @ClassName GetValueThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 19:24
 */
public class GetValueThread extends Thread {
    private GetService service;

    public GetValueThread(GetService service){
        this.service = service;
    }

    @Override
    public void run() {
        while(true){
            service.getMethod();

        }
    }
}
