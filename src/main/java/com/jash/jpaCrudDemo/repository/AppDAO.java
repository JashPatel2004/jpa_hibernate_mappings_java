package com.jash.jpaCrudDemo.repository;

import com.jash.jpaCrudDemo.entity.Course;
import com.jash.jpaCrudDemo.entity.Instructor;
import com.jash.jpaCrudDemo.entity.InstructorDetail;
import com.jash.jpaCrudDemo.entity.Student;

import java.util.List;

interface AppDAO {


    Student findStudentById(int id);
    Instructor findInstructorById(int theId);
    InstructorDetail findInstructorDetailById(int theId);
    Course findCourseById(int id);



    void addStudent(Student student);
    void addInstructor(Instructor instructor);
    void addInstructorDetails(InstructorDetail instructorDetail);
    void addCourse(Course course);




    void updateStudent(Student student);
    void updateInstructor(Instructor instructor);
    void updateCourse(Course course);



    String deleteStudentById(int id);
    String deleteInstructorById(int id);
    String deleteInstructorDetail(int theId);
    String deleteCourseById(int id);






    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    Course findCourseAndReview(int theId);

    Course findCourseAndStudent(int theId);

    Student findStudentAndCourse(int theId);


}
