package Chapter3.stack_50;

/**
 * @ClassName GetService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 19:21
 */
public class GetService {
    private Box box;

    public GetService (Box box){
        this.box = box;
    }
    public void getMethod(){
        try{
            synchronized (this){
                while(box.size() == 0){
                    this.wait();
                }
                box.remove();
            }
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void checkBoxStatus(){
        try{
            synchronized (this){
                if(box.size() > 0){
                    this.notifyAll();
                }
            }
            Thread.sleep(1000);
            System.out.println("get check box status "+box.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
