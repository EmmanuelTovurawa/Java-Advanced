<%-- 
    Document   : ListMovies
    Created on : 21 Feb 2023, 10:38:16
    Author     : Manex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html public "-//W3C//DTD HTML 4.0
    Transitional//EN">
<%@ page import="com.lowewriter.movie.*" %>
<%@ page import="java.util.*" %>
<html>
    <head>
        <title>List Movies: The Servlet</title>
    </head>
    <body>
        <h1>Some of My Favorites</h1>
        <h3>
            <%= getMovieList()%> 
        </h3>
    </body>
</html>
<%!
    private String getMovieList() {
        String msg = "";
        ArrayList<Movie> movies = MovieIO.getMovies();
        for (Movie m : movies) {
            msg += m.year + ": ";
            msg += m.title + "<br>";
        }
        return msg;
    }
%>
