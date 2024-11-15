package com.enigma.dynamicwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        if ("admin".equals(userId) && "password".equals(password)) {
            request.getSession().setAttribute("userId", userId);
            response.sendRedirect("dashboard");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print("<html><body>");
            out.print("<p>Invalid credentials. Please try again.</p>");
            out.print("</body></html>");
        }
    }
}
