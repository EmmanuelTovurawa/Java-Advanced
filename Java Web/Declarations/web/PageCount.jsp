<%-- 
    Document   : PageCount
    Created on : 20 Feb 2023, 16:07:16
    Author     : Manex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@ page import = "java.text.*" %>
    <%@ page import = "java.util.*" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            This JSP has been displayed <%= count++%>
            time.</h1>
    </body>
</html>
<%!
    private static int count = 1;
%>
</html>
