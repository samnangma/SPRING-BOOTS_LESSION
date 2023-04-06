package com.example.corespring.service;

import com.example.corespring.model.student;
import com.example.corespring.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component


public class StudentService {
    StudentRepository studentRepository;
    public StudentService (){
        studentRepository = new StudentRepository();
    }

    public List<student> getAllStudents(){

        return studentRepository.getStudentList();
    }
}
