package Chapter3.waitOld;



/**
 * @ClassName MyThreadA
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 17:18
 */
public class MyThreadA extends Thread{
    private Service service;

    public MyThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.add();
    }
}
