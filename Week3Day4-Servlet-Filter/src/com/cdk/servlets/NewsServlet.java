package com.cdk.servlets;

import java.io.IOException;
import java.io.PrintWriter;

public class NewsServlet extends javax.servlet.http.HttpServlet {


    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("News Alert: India won the match");
        pw.write("<br><a href=\"Menu.html\">visit menu page</a>");

    }
}
