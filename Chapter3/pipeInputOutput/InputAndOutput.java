package Chapter3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ClassName InputAndOutput
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 15:46
 */
public class InputAndOutput {

    public void readData(PipedInputStream input){
        System.out.println("read: ");
        byte[] byteArray = new byte[20];
        try {
            int readLength = input.read(byteArray);//读取字节到byteArray
            while(readLength != -1){
                String newData = new String(byteArray,0,readLength);
                System.out.println(newData);
                readLength = input.read(byteArray);//读取字节到byteArray
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(PipedOutputStream out){
        try{
            System.out.println("write: ");
            for(int i = 0;i<300;i++){
                String outData = ""+(i+1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
