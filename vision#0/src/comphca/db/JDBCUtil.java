package comphca.db;

import java.net.URI;
import java.sql.*;

public class JDBCUtil {

    private static String user = "root";
    private static String passwd = "";
    private static String url = "jdbc:mysql://localhost:3306/db_studentInfo";
    private static String jdbcName = "com.mysql.jdbc.Driver";

    public static Connection getCon(){
        try {
            Class.forName(jdbcName);
            return DriverManager.getConnection(url,user,passwd);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void close(ResultSet rs, Statement ps, Connection con){
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }

        try {
            if (con != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void close(Statement ps, Connection con){
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (con != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
