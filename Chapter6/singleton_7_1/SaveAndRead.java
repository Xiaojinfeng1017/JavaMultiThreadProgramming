package Chapter6.singleton_7_1;

import java.io.*;

/**
 * @ClassName SaveAndRead
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 20:26
 */
public class SaveAndRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyObject myObject = MyObject.getInstance();
        System.out.println("序列化-myobject=  " + myObject.hashCode() +"  userinfo  " + MyObject.userinfo.hashCode());
        FileOutputStream fosRef = new FileOutputStream(new File("mytest.txt"));
        ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
        oosRef.writeObject(myObject);
        oosRef.close();
        fosRef.close();


        FileInputStream fisRef = new FileInputStream(new File("mytest.txt"));
        ObjectInputStream iosRef = new ObjectInputStream(fisRef);
        MyObject myObject1 = (MyObject)iosRef.readObject();
        iosRef.close();
        fisRef.close();
        System.out.println("序列化-myobject=  " + myObject1.hashCode() +"   userinfo  " + myObject1.userinfo.hashCode());


    }
}
