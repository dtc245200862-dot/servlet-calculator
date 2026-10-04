package com.codegym.servlet;

import com.codegym.model.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        try {
            float firstOperand = Float.parseFloat(request.getParameter("first-operand"));
            float secondOperand = Float.parseFloat(request.getParameter("second-operand"));
            char operator = request.getParameter("operator").charAt(0);

            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head><title>Result</title></head>");
            writer.println("<body>");
            writer.println("<h1>Result:</h1>");

            try {
                float result = Calculator.calculate(firstOperand, secondOperand, operator);
                writer.println("<p style='font-size: 18px;'>" + firstOperand + " " + operator + " " + secondOperand + " = " + result + "</p>");
            } catch (Exception ex) {
                writer.println("<p style='color: red; font-size: 18px;'>Error: " + ex.getMessage() + "</p>");
            }

            writer.println("<br><a href='index.jsp'>Back to Calculator</a>");
            writer.println("</body>");
            writer.println("</html>");
        } catch (Exception e) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head><title>Error</title></head>");
            writer.println("<body>");
            writer.println("<h1>Result:</h1>");
            writer.println("<p style='color: red; font-size: 18px;'>Error: " + e.getMessage() + "</p>");
            writer.println("<br><a href='index.jsp'>Back to Calculator</a>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}
