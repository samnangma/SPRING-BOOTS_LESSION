package com.example.corespring.model;

import com.example.corespring.service.StudentService;

public class testingDemo {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        System.out.println("Hello Student ");
        studentService.getAllStudents().stream().forEach(System.out::println);
    }
}
