package Chapter3.stack_50;

/**
 * @ClassName SetService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 16:46
 */
public class SetService {
    private Box box;

    public SetService(Box box){
        this.box = box;
    }

    public void setMethod(){
        try{
            synchronized (this){
                while(box.size() == 10){
                    this.wait();
                }
            }
            Thread.sleep(1000);
            box.add();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void checkBoxStatus(){
        try{
            while(true){
                synchronized (this){
                    if(box.size() < 10){
                        this.notifyAll();
                    }
                }
                System.out.println("set check box status "+box.size());
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
