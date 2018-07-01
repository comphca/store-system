<%--
  Created by IntelliJ IDEA.
  User: comphca
  Date: 2018/7/1
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="/HandleRegist" method="post">
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
            <td colspan="2"><input type="submit">
                <input type="reset">
            </td>
            <td></td>
        </tr>
    </table>
</form>

<script type="text/javascript">
    function reset() {
        document
    }
</script>
</body>
</html>
