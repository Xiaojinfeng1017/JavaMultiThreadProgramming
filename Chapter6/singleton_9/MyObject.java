package Chapter6.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName MyObject
 * @Description TODO
 * @Author xjf_b
 * @Date 2020/12/23 20:49
 */
public enum MyObject {
    connectionFactory;

    private Connection connection;

     MyObject() {
       try{
           System.out.println("调用了MyObject的构造器");
           String url = "jdbc:mysql://localhost:3306/hospital";
           String username = "root";
           String password = "123456";
           String driverName = "com.mysql.jdbc.Driver";
           Class.forName(driverName);
           connection = DriverManager.getConnection(url,username,password);
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }catch (SQLException e){
           e.printStackTrace();
       }

    }

    public Connection getConnection(){
        return connection;
    }
}
