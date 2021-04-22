package Chapter3.stack_10;

/**
 * @ClassName Service
 * @Description 业务类 生产者和消费者
 * @Author xjf_b
 * @Date 2020/12/17 20:35
 */
public class Service {
    private Box box = new Box();

    //生产 业务方法
    public void addElem(){
        try{

            synchronized (this){
                while(box.size() >= 10){
                    this.wait();
                }
                Thread.sleep(1000);
                box.add();
                System.out.println("增加一个元素，现在大小是："+box.size());
                this.notifyAll();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //消费
    public void removeElem(){
        try{
            synchronized (this){
                while(box.size() == 0){
                    this.wait();
                }
                box.remove();
                System.out.println("删除一个元素，现在大小是："+box.size());
                this.notifyAll();

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
