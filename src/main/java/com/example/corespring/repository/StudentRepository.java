package com.example.corespring.repository;

import com.example.corespring.model.student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<student> studentList =  new ArrayList<>() {{
        add(new student(101,"Data","male",80));
        add(new student(102,"Sara","female",90));
        add(new student(103,"Nara","male",190));
        add(new student(104,"Wara","female",190));

    }};



    public List <student> getStudentList(){
        return studentList;
    }

    public student getStudentByID(int id ){
        return studentList.stream().filter((student -> student.id == id)).findFirst().orElse((null));
    }

}
