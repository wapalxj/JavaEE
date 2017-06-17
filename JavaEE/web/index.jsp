<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/9
  Time: 21:41
  To change this template use File | Settings | File Templates.
  http://localhost:8080/vero/index.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP</title>
  </head>
  <body>
  Servlet创建成功
  当前为JSP页面
  vero1111111111111111111111111111111111111111
  $END$
  <a href="Servlet_vero?loginName=vero&loginPassword=123456">点击跳转到Servlet_vero</a>
<%--href和action:::::::Servlet_vero或者./Servlet_vero或者http://localhost:8080/vero/Servlet_vero(index.jsp)--%>
  <hr/>
  <form action="TestServlet2" method="post">
    loginName:<input type="text" name="loginName"><br/>
    loginPassword:<input type="text" name="loginPassword" >
    <input type="submit" value="post提交" >
  </form>
  </body>
</html>
