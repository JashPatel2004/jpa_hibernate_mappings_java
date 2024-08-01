package com.jash.jpaCrudDemo.repository.user;

import com.jash.jpaCrudDemo.entity.Student;

public interface UserService {

    public Student findUserById(long userId) ;
    public Student findUserProfileByJwt(String jwt) ;
}
