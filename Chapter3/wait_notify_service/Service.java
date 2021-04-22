package Chapter3.wait_notify_service;

/**
 * @ClassName Service
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 17:11
 */
public class Service {
    private Object lock = new Object();
    private MyList list = new MyList();

    public void waitMethod(){
        try{
            synchronized (lock){
                if(list.size() != 5){
                    System.out.println("开始wait");
                    lock.wait();
                    System.out.println("结束wait");
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void notifyMethod(){

        synchronized (lock){
            for(int i = 0;i<10;i++){
                list.add(i);
                if(list.size() == 5){
                    lock.notify();
                }
            }
            System.out.println("list的大小："+list.size());
            System.out.println("  如果是10说明notify之后并没有立刻释放资源，等同步块完成");


        }

    }
}
