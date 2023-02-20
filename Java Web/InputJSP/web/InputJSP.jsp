<%-- 
    Document   : InputJSP
    Created on : 20 Feb 2023, 14:54:18
    Author     : Manex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Input JSP</title>
    </head>
    <body>
        <form action="InputJSP.jsp" method="post">
            Enter some text:&nbsp;
            <input type="text" name="Text">
            <br><br>
            <input type="submit" value="Submit">
        </form><br>
        <h3>You entered:&nbsp;
            <%= request.getParameter("Text")%></h3>
    </body>
</html>
