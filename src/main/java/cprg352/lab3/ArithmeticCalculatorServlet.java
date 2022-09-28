package cprg352.lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = "---";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the parameters from the request
        String firstInput = request.getParameter("num1");
        String secondInput = request.getParameter("num2");
        String operation = request.getParameter("operation");

        // validate the input and forward the request and response objects to the JSP
        if (firstInput == null || firstInput.equals("") || secondInput == null || secondInput.equals("") || !firstInput.matches("[0-9]+") || !secondInput.matches("[0-9]+")) {
            request.setAttribute("result", "Invalid");
        }
        else {
            int first = Integer.parseInt(firstInput);
            int second = Integer.parseInt(secondInput);
            int result = 0;
            switch (operation) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "%":
                    result = first % second;
                    break;
            }
            request.setAttribute("result", result);
        }
            request.setAttribute("num1", firstInput);
            request.setAttribute("num2", secondInput);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
    }
}
