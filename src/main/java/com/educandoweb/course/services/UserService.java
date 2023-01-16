package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User insert(User obj);

}
