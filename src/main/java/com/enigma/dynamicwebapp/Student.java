package com.enigma.dynamicwebapp;

public class Student {
    private final String studentId;
    private final String studentName;
    private final String department;
    private final Integer mark;

    public Student(String studentId, String studentName, String department, Integer mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return mark;
    }

    public boolean isPassed() {
        return mark >= 40;
    }
}

