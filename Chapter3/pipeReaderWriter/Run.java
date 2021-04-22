package Chapter3.pipeReaderWriter;

import java.io.*;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 16:10
 */
public class Run {
    public static void main(String[] args) {

            ReaderAndWriter rw = new ReaderAndWriter();

            PipedReader in = new PipedReader();
            PipedWriter out = new PipedWriter();
            try {
                out.connect(in);
                //in.connect(out); 一次连接就够了

                ReadThread readThread = new ReadThread(rw,in);
                readThread.start();
                Thread.sleep(1000);

                WriteThread writeThread = new WriteThread(rw,out);
                writeThread.start();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
