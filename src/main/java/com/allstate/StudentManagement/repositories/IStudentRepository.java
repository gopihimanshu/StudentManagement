package com.allstate.StudentManagement.repositories;

import com.allstate.StudentManagement.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student, Integer> {
}
