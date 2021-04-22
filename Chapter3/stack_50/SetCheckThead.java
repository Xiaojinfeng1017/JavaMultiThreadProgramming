package Chapter3.stack_50;

/**
 * @ClassName SetCheckThead
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 19:19
 */
public class SetCheckThead extends Thread {
    private SetService setService;

    public SetCheckThead(SetService setService){
        super();
        this.setService = setService;
    }

    @Override
    public void run() {
        setService.checkBoxStatus();
    }
}
