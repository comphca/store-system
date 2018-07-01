package comphca.service;

import comphca.dao.UserDao;
import comphca.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "HandleLogin",urlPatterns = "/HandleLogin")
public class HandleLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = null;
        String pwd = null;

        name = request.getParameter("username");
        pwd = request.getParameter("password");

        User user = new User(name,pwd);

        /*//System.out.println(user.getName());
        UserDao.regist(user);*/

        ResultSet rs = UserDao.login(user);
        try {
            if (rs.next()){
                request.getRequestDispatcher("/LoginSuccess.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
