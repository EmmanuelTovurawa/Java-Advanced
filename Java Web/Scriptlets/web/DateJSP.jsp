<%-- 
    Document   : DateJSP
    Created on : 20 Feb 2023, 15:50:59
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
            Today is
            <%
                DateFormat df = DateFormat.getDateInstance(
                        DateFormat.FULL);
                Date today = new Date();
                String msg = df.format(today);
                out.println(msg);
            %>
        </h1>
        <h1>Have a nice day!</h1>
    </body>
</html>
