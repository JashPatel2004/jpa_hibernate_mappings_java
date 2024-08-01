package com.jash.jpaCrudDemo.controller;

import com.jash.jpaCrudDemo.entity.Course;
import com.jash.jpaCrudDemo.entity.Instructor;
import com.jash.jpaCrudDemo.entity.InstructorDetail;
import com.jash.jpaCrudDemo.entity.Student;
import com.jash.jpaCrudDemo.repository.AppDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    private AppDAOImpl appDAO;


    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable("id") int id){
        return appDAO.findStudentById(id);
    }

    @GetMapping("/instructor/{id}")
    public Instructor findInstructorById(@PathVariable("id") int id) {
        return appDAO.findInstructorById(id);
    }

    @GetMapping("/instructorDetail/{id}")
    public InstructorDetail findInstructorDetailById(@PathVariable("id") int id) {
        return appDAO.findInstructorDetailById(id);
    }

    @GetMapping("/course/{id}")
    public Course findCourseById(@PathVariable("id") int id) {
        return appDAO.findCourseById(id);
    }


}
