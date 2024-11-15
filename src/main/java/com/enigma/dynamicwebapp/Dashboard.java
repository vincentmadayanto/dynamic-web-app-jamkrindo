package com.enigma.dynamicwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = (String) request.getSession().getAttribute("userId");

        if (userId == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        request.setAttribute("userId", userId);

        List<Student> students = Arrays.asList(
                new Student("S1", "Vincent", "Dep 1", 35),
                new Student("S2", "Stefani", "Dep 1", 70),
                new Student("S3", "Kris", "Dep 1", 60),
                new Student("S4", "Stelly", "Dep 1", 90),
                new Student("S5", "Abdul", "Dep 2", 30),
                new Student("S6", "Aldo", "Dep 3", 32),
                new Student("S7", "Darul", "Dep 3", 70),
                new Student("S8", "Refanda", "Dep 3", 20)
        );

        request.setAttribute("students", students);

        request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
    }
}
