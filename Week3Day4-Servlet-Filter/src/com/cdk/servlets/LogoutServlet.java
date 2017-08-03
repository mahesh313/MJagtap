package com.cdk.servlets;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutServlet extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("Login-Status", false);
        response.setContentType("text/html");
        response.getWriter().write("You are logged out!!");
        response.getWriter().write("<br><a href=\"Menu.html\">visit menu page</a>");
    }
}

