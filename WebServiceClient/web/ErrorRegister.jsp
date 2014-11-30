<%-- 
    Document   : ErrorRegister
    Created on : May 5, 2013, 10:16:39 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
    </head>
    <body>
       <body>
           <div id="page-wrap">
        <center>
        <h1>Register Page</h1>
        Username existent.Reincercati!
        <form action="RegisterCheck.jsp" method="post"> 
            <table> 
            <tr>
                <td>Username :</td>
                <td><input name="username" value="" size="20" type="text"></td> 
            </tr>
            <tr>
                <td>Password :</td>
                <td><input name="password" value="" size="20" type="password"></td>
            </tr>
            <tr><td></td><td></td></tr>
            <tr>
                <td><input value="Register" type="submit"></form></td>
                <td><form action="index.jsp"><input value="Cancel" type="submit"></form></td>
            </tr>
            </table>
        </center>
            </div>
    </body>
</html>
