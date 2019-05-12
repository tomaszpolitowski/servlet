package pl.tpolitowski;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();

        //resp.sendRedirect(req.getContextPath()+"/second");
        //getServletContext().getRequestDispatcher("/second").forward(req,resp);
       // getServletContext().getRequestDispatcher("/second").include(req,resp);


       // Cookie cookie = new Cookie("cookieName", name);
        //resp.addCookie(cookie);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        //out.println("Hello from postman");
        String name = req.getParameter("name");
        String password = req. getParameter("password");

       // out.println( name + password );
        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("password",password);
        out.println("<a href =\"/second\"> click</a>");
    }
}
