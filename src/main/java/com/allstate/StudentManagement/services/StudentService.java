package com.allstate.StudentManagement.services;

import com.allstate.StudentManagement.entities.Student;
import com.allstate.StudentManagement.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService {

    private IStudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> findById(int id){
        return this.studentRepository.findAll();
    }
}
