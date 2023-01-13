package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
}
