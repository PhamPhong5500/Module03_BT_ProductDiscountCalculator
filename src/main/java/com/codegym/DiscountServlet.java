package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.setContentType("text/html");
                response.setCharacterEncoding("UTF-8");

                float price = Float.parseFloat(request.getParameter("price"));
                float percent= Float.parseFloat(request.getParameter("percent"));

                double amount = price * 0.01;
                double discountPrice = price * (1 - amount);

                PrintWriter writer = response.getWriter();
                writer.println("<html>");
                writer.println("Giá Nhập vào là : " + price  + "<br>");
                writer.println("Tỉ lệ chiết khấu là : " + percent + "<br>");
                writer.println("Lượng triết khấu là : " + amount + "<br>");
                writer.println("Giá sau khi triết khấu là : " + discountPrice);
                writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        float price = Float.parseFloat(request.getParameter("price"));
        float percent= Float.parseFloat(request.getParameter("percent"));

        double amount = price * 0.01;
        double discountPrice = price * (1-amount);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Giá Nhập vào là : " + price  + "<br>");
        writer.println("Tỉ lệ chiết khấu là : " + percent + "<br>");
        writer.println("Lượng triết khấu là : " + amount + "<br>");
        writer.println("Giá sau khi triết khấu là : " + discountPrice);
        writer.println("</html>");
    }
}
