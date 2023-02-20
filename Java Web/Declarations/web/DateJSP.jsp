<%-- 
    Document   : DateJSP
    Created on : 20 Feb 2023, 16:22:39
    Author     : Manex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@ page import="java.text.*" %>
    <%@ page import="java.util.*" %>
    <head>
        <title>Date JSP</title>
    </head>
    <body>
        <h1>
            Today is <%= getDate()%></h1>
        <h1>Have a nice day!</h1>
    </body>
</html>
<%!
    private String getDate() {
        DateFormat df
                = DateFormat.getDateInstance(DateFormat.FULL);
        Date today = new Date();
        return df.format(today);
    }
%>
