package com.educandoweb.course.services;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
}
