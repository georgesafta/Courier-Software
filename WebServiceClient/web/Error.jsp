<%-- 
    Document   : Error
    Created on : May 5, 2013, 2:54:23 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
    </head>
    <body>
        <div id="page-wrap">
    <center>
        <h1>Login</h1>
        Username sau parola gresita.Reincercati!
        <form action="LoginCheck.jsp" method="post"> 
            <table> 
                <tr>
                    <td>Username :</td>
                    <% java.lang.String username = "";
                        if (session.getAttribute("username") != null) {
                            username = session.getAttribute("username") + "";
                        }
                        java.lang.String password = "";
                        if (session.getAttribute("password") != null) {
                            password = session.getAttribute("password") + "";
                        }
                    %>
                    <td><input name="username" value="<%=username%>" size="20" type="text"></td> 
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><input name="password" value="<%=password%>" size="20" type="password"></td>
                </tr>
                <tr><td></td><td></td></tr>
                <tr>
                    <td><input value="Login" type="submit"></form></td>
                    <td><form action="Register.jsp"><input value="Register" type="submit"> </form></td>
                </tr>
            </table>
    </center>
        </div>
      </body>
</html>
