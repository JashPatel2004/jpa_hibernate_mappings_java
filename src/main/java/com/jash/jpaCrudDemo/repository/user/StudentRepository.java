package com.jash.jpaCrudDemo.repository.user;

import com.jash.jpaCrudDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    public Student findByEmail(String email);
}
