<%-- 
    Document   : RegisterCheck
    Created on : May 5, 2013, 10:12:48 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <%-- start web service invocation --%><hr/>
    <%
    try 
    {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	java.lang.String username = request.getParameter("username");
	java.lang.String password = request.getParameter("password");
	java.lang.String result = port.register(username, password);
        if(result.equals("true"))
        {
            session.setAttribute("username",username);
            session.setAttribute("password", password);
            response.sendRedirect("Home.jsp");
        }
        else
            response.sendRedirect("ErrorRegister.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
