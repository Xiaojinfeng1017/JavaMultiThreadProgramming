package Chapter3.waitOld;


/**
 * @ClassName MyThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 17:18
 */
public class MyThreadB extends Thread{
    private Service service;

    public MyThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.substract();
    }
}
