package com.educandoweb.course.resource;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {



    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Jesse", "jessecondori@gmail.com","19978205759","000000");
        return ResponseEntity.ok().body(user);
    }
}
