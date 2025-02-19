package com.project.course.resources;

import com.project.course.entities.Users;
import com.project.course.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<Users>> findAll(){
        List<Users> list = service.findAll();
         return ResponseEntity.ok().body(list);
    }

    @GetMapping(value =  "/{id}")
    public ResponseEntity<Users> findById( @PathVariable Long id){
        Users obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
 @PostMapping
    public ResponseEntity<Users> insert (@RequestBody Users obj){
        obj = service.insert(obj);
         URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
         return ResponseEntity.created(uri).body(obj);
 }
 @DeleteMapping(value =  "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
 }

 @PutMapping(value = "/{id}")
    public ResponseEntity<Users> update (@PathVariable Long id, @RequestBody Users obj){
        obj = service.update(id,obj);
        return ResponseEntity.ok().body(obj);
 }

}
