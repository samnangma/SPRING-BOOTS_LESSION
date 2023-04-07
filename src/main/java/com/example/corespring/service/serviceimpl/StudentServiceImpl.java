package com.example.corespring.service.serviceimpl;

import com.example.corespring.model.student;
import com.example.corespring.repository.StudentRepository;
import com.example.corespring.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    // Student Repository
    StudentRepository studentRepository;
    StudentServiceImpl(){
        studentRepository = new StudentRepository();
    }
    @Override
    public List<student> getAllStudents() {
        return studentRepository.getStudentList();
    }

    @Override
    public student findStudentByID(int id) {
        return studentRepository.getStudentByID(id);
    }
}
