package Chapter3.pipeInputOutput;

import java.io.PipedOutputStream;

/**
 * @ClassName ReadThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:07
 */
public class WriteThread extends Thread {
    private InputAndOutput rw;
    private PipedOutputStream out;

    WriteThread(InputAndOutput rw, PipedOutputStream out){
        this.rw = rw;
        this.out = out;
    }

    @Override
    public void run() {
        rw.writeData(out);
    }
}
