package cprg352.lab3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // get the parameters from the request
    String ageInput = request.getParameter("age");
    // set the attributes in the request
    request.setAttribute("age", ageInput);
    // validate the input and forward the request and response objects to the JSP
    if (ageInput == null || ageInput.equals("")) {
        request.setAttribute("message", "You must give your current age");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    else if(!ageInput.matches("[0-9]+")) {
        request.setAttribute("message", "You must enter a number");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    else {
        int age = Integer.parseInt(ageInput);
        request.setAttribute("age", age);
        request.setAttribute("message", "Your age next birthday will be " + (age + 1));
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }
}