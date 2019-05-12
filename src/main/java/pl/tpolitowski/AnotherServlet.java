package pl.tpolitowski;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class AnotherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("Hello World from Another Servlet");


//        Cookie[] cookies = req.getCookies();
////        for (int i = 0; i <cookies.length ; i++) {
////            if (cookies[i].getName().equals("cookieName"))
////            out.println(cookies[i].getValue());
//        String name = Arrays.stream(req.getCookies())
//                .filter(cookie -> cookie.getName().equals("cookieName"))
//                .findAny().get().getValue();

      //out.println(name);
      out.println(req.getSession().getAttribute("name"));
      out.println(req.getSession().getAttribute("password"));

        }


    }



