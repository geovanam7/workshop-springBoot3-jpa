package com.project.course.resources;

import com.project.course.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<Users> findAll(){
         Users u = new Users(1l,"maria", "maria@gmail.com", "9999999", "12345");
         return ResponseEntity.ok().body(u);
    }

}
