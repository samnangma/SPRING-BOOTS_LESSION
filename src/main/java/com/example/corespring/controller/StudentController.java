package com.example.corespring.controller;

import com.example.corespring.model.student;
import com.example.corespring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    StudentService studentService;
    @Autowired
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("/allstudents")
    public List<student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
