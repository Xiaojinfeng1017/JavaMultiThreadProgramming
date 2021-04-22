package Chapter3.pipeReaderWriter;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @ClassName ReadThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:07
 */
public class WriteThread extends Thread {
    private ReaderAndWriter rw;
    private PipedWriter out;

    WriteThread(ReaderAndWriter rw, PipedWriter out){
        this.rw = rw;
        this.out = out;
    }

    @Override
    public void run() {
        rw.writeData(out);
    }
}
