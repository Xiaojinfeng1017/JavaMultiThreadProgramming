package Chapter3.pipeReaderWriter;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @ClassName ReadThread
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:07
 */
public class ReadThread extends Thread {
    private ReaderAndWriter rw;
    private PipedReader input;

    ReadThread(ReaderAndWriter rw, PipedReader input){
        this.rw = rw;
        this.input = input;
    }

    @Override
    public void run() {
        rw.readData(input);
    }
}
