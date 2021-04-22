package Chapter2.innerStaticClass;

import Chapter2.innerStaticClass.PublicClass.PrivateClass;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 9:12
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setPassword("password");
        publicClass.setUsername("username");

        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());
        //需要import Chapter2.innerStaticClass.PublicClass.PrivateClass;引入
        PrivateClass privateClass = new PrivateClass();
        privateClass.setAddress("address");
        privateClass.setAge("12");
        privateClass.printPublicProperty();
        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());
    }
}
