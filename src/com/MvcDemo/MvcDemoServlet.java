package com.MvcDemo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MvcDemoServlet")
public class MvcDemoServlet  extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response){
        StudentDataUtil studentDataUtil = new StudentDataUtil();
        request.setAttribute("peoples",studentDataUtil.getStudents());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/MvcDemo.jsp");
        try {
            dispatcher.forward(request, response);
        }catch (ServletException | IOException ex){
            ex.printStackTrace();
        }
    }
}
