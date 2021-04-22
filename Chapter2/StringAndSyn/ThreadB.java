package Chapter2.StringAndSyn;

/**
 * @ClassName ThreadB
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 22:00
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new String("AA"));
    }
}
