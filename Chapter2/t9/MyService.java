package Chapter2.t9;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/16 19:08
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try{
            synchronized (list){
                if(list.getSize() < 1){ //当对list加锁后，list中最多只能有一个元素
                    Thread.sleep(3000);//模拟从远程端花费3s取回数据
                    list.add(data);
                }
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }
}
