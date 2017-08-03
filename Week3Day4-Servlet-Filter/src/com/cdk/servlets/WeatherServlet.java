package com.cdk.servlets;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class WeatherServlet extends javax.servlet.http.HttpServlet {
    Map<String,String> data = new HashMap<>();

    public void init()  throws ServletException {

        data.put("Pune","22");
        data.put("Mumbai","28");
        data.put("Delhi","42");
        data.put("GOA","23");
    }

    public void destroy() {
        data.clear();
        data = null;
    }


    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String cityName = request.getParameter("city");
        String dayName = request.getParameter("day");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("Weather of the "+cityName+" on "+dayName+" day is : "+data.get(cityName)+" degree.");
        pw.write("<br><a href=\"Menu.html\">visit menu page</a>");
        pw.write("<br><a href=\"logout\">logout</a>");


    }
}
