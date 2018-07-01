package comphca.dao;

import comphca.entity.User;
import comphca.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    //这里的静态代码块该怎么写
/*    static {

        Connection con = null;
        PreparedStatement ps = null;

        con = JDBCUtil.getCon();
    }*/
    public static void regist(User user){

        Connection con = null;
        PreparedStatement ps = null;

        con = JDBCUtil.getCon();
        try {
            ps = con.prepareStatement("INSERT INTO user VALUES (?,?)");
            ps.setObject(1,user.getName());
            ps.setObject(2,user.getPwd());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet login(User user){

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        con = JDBCUtil.getCon();
        try {
            ps = con.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
            ps.setObject(1,user.getName());
            ps.setObject(2,user.getPwd());

            rs = ps.executeQuery();
            return rs;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
