<%@ page import="java.util.Arrays, java.util.List" %>
<%@ page import="com.enigma.dynamicwebapp.Student" %>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/dashboard.css"/>
</head>
<body>
<%
    String userId = (String) session.getAttribute("userId");
    if (userId == null) {
    response.sendRedirect("index.jsp");
    return;
}
%>
<h1>Welcome <%= userId %></h1>
<table>
    <tr>
        <th>Department</th>
        <th>Student ID</th>
        <th>Marks</th>
        <th>Pass %</th>
    </tr>
    <%
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
        for (Student student : students) {
    %>
    <tr>
        <td><%= student.getDepartment() %></td>
        <td><%= student.getStudentId() %></td>
        <td><%= student.getMarks() %></td>
        <td><%= (student.getMarks() >= 40 ? "Pass" : "Fail") %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>