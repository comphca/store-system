package comphca.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private String user = "root";
    private String passwd = "";
    private String url = "jdbc:mysql://localhost:3306/db_studentInfo";
    private String jdbcName = "com.mysql.jdbc.Driver";

    /*
        这个方法不能为静态方法，不然获取不到jdbcname
     */
    public Connection getCon() throws Exception {
         Class.forName(jdbcName);
         Connection con = DriverManager.getConnection(url,user,passwd);
         return con;
    }

    public void closeCon(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        DbUtil dbUtil = new DbUtil();
        dbUtil.getCon();
        System.out.println("lianjie success");
    }

}
