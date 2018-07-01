<%--
  Created by IntelliJ IDEA.
  User: comphca
  Date: 2018/7/1
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/HandleLogin">
    <table>
        <tr>
            <td>name:</td>
            <td><input type="text" name="username"></td>
        </tr>

        <tr>
            <td>pwd:</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="登陆">
                <a href="./Regist.jsp" type="button">注册</a>
            </td>
            <td></td>
        </tr>


    </table>
</form>

</body>
</html>
