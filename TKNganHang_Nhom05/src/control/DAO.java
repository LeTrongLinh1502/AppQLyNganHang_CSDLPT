
package control;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
public class DAO {
    public static Connection con;


    public DAO() {
        String server = "ADMIN";
        String user = "sa";
        String pass ="01012001";
        String db ="QuanLyTaiKhoanNganHang2";
        int port =1433;
        SQLServerDataSource sql = new SQLServerDataSource();
        sql.setUser(user);
        sql.setPortNumber(port);
        sql.setServerName(server);
        sql.setPassword(pass);
        sql.setDatabaseName(db);
        try {
            con = sql.getConnection();
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Loi");
        }
    }
      
      
    public static void main(String[] args) {

    }
}