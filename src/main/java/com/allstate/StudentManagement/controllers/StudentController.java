package com.allstate.StudentManagement.controllers;

import com.allstate.StudentManagement.entities.Student;
import com.allstate.StudentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

//    @RequestMapping(value = "/name/{id}",method = RequestMethod.GET)
//    public Student findById(@PathVariable int id){
//        String a [] = new String[5] ;
//        a[1] = "hiI";
//        a[2] = "Bye";
//        return a.;
//        return this.studentService.findById(id);
//    }

    @RequestMapping(value = "/name/{id}",method = RequestMethod.GET)
    public Iterable<Student> findById(@PathVariable int id){
        return this.studentService.findById(id);
    }
}
