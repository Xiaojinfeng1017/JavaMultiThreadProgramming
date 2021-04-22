package Chapter3.stack_50;

/**
 * @ClassName SetCheckThead
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 19:19
 */
public class GetCheckThead extends Thread {
    private GetService getService;

    public GetCheckThead(GetService getService){
        super();
        this.getService = getService;
    }

    @Override
    public void run() {
        getService.checkBoxStatus();
    }
}
