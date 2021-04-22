package Chapter3.p_r_test;

/**
 * @ClassName Run
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/17 19:59
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        PThread[] p = new PThread[5];
        CThread[] c = new CThread[5];
       for(int i = 0;i<5;i++){
           p[i] = new PThread(service);
           p[i].start();

           c[i] = new CThread(service);
           c[i].start();
       }
    }
}
