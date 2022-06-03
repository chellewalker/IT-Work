package Servlets;
    import javax.servlet.*;
    import java.io.*;

@WebServlet(name = "Servlets", urlPatterns={"/Servlets"})
public class Servlets extends HttpServlet {


    //Correct Credentials
    protected void cLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head></head><body>");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        out.println("<h1>Login Information</h1>");
        out.println("<p>The following details your current credentials.</p>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("<h2>NOTICE: Your password must be changed immediately after the use of this page.</h2>");
        out.println("</body></html>");
    }

    //Invailid Credentials
    protected void iLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Invailid credentials. Check entry for spelling or contact IT Support.");
    }

}