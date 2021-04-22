package Chapter3.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @ClassName ReadThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:07
 */
public class ReadThread extends Thread {
    private InputAndOutput rw;
    private PipedInputStream input;

    ReadThread(InputAndOutput rw, PipedInputStream input){
        this.rw = rw;
        this.input = input;
    }

    @Override
    public void run() {
        rw.readData(input);
    }
}
