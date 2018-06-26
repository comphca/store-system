package comphca.dao;

import comphca.db.JDBCUtil;
import comphca.entity.Goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodsDao {

    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con = null;




   /* public boolean addGoods(Goods goods){
        boolean bool = false;
        con = JDBCUtil.getCon();
        try {
            pst = con.prepareStatement("insert into t_user (id,userName,password) values (5,?,?)");
            pst.setObject(1,"nm1");
            pst.setObject(2,"123");
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }*/

    public static void main(String[] args){
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection con = null;
        con = JDBCUtil.getCon();
        try {
            pst = con.prepareStatement("insert into t_user (id,userName,password) values (5,?,?)");
            pst.setObject(1,"nm1");
            pst.setObject(2,"123");
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
