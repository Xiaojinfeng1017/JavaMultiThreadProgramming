package Chapter2.t9;

/**
 * @ClassName MyThread1
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 19:10
 */
public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list,"B");
    }
}
