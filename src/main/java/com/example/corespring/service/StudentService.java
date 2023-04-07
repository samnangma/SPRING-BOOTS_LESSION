package com.example.corespring.service;

import com.example.corespring.model.student;
import com.example.corespring.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;



public interface StudentService {
    // features
    public List <student> getAllStudents();

    public student findStudentByID(int id);
}





//    StudentRepository studentRepository;
//    public StudentService (){
//        studentRepository = new StudentRepository();
//    }
//
//    public List<student> getAllStudents(){
//
//        return studentRepository.getStudentList();
//    }