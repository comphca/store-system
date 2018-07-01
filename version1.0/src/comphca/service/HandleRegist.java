package comphca.service;

import comphca.dao.UserDao;
import comphca.entity.User;
import comphca.utils.JDBCUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HandleRegist",urlPatterns = "/HandleRegist")
public class HandleRegist extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");

        User user = new User(name,pwd);

        UserDao.regist(user);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
