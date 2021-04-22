package Chapter3.pipeReaderWriter;

import java.io.*;

/**
 * @ClassName InputAndOutput
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/19 15:46
 */
public class ReaderAndWriter {

    public void readData(PipedReader input){
        System.out.println("read: ");
        char[] charArray = new char[20]; //不用字节数组 而是字符数组
        try {
            int readLength = input.read(charArray);//读取字节到byteArray
            while(readLength != -1){
                String newData = new String(charArray,0,readLength);
                System.out.println(newData);
                readLength = input.read(charArray);//读取字节到byteArray
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(PipedWriter out){
        try{
            System.out.println("write: ");
            for(int i = 0;i<300;i++){
                String outData = ""+(i+1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
