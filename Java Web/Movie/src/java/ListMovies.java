/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manex
 */
@WebServlet(urlPatterns = {"/ListMovies"})
public class ListMovies extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String msg = getMovieList();
out.println("<html>");
out.println("<head>");
out.println(
"<title>List Movies Servlet</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Some of My Favorites</h1>");
out.println("<h3>");
out.println(msg);
out.println("</h3>");
out.println("</body>");
out.println("</html>");
}
public void doPost(HttpServletRequest request, 
HttpServletResponse response)
throws IOException, ServletException
{
doGet(request, response);
}
private String getMovieList() 
{
String msg = "";
ArrayList<Movie> movies = MovieIO.getMovies();
for (Movie m : movies)
    {
msg += m.year + ": ";
msg += m.title + "<br>";
}
return msg;
}

}
