package Chapter3.stack_50;

/**
 * @ClassName Test
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/18 19:27
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        SetService setService = new SetService(box);
        for(int i=0;i<5;i++){
            SetValueThread setValueThread =
                    new SetValueThread(setService);
            setValueThread.start();
        }
        SetCheckThead setCheckThead = new SetCheckThead(setService);
        setCheckThead.start();

        Thread.sleep(1000);

        GetService getService = new GetService(box);
        for(int i = 0;i<5;i++){
            GetValueThread getValueThread =
                    new GetValueThread(getService);
            getValueThread.start();
        }
        GetValueThread getValueThread = new GetValueThread(getService);
        getValueThread.start();
    }
}
