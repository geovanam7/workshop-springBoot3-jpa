package com.project.course.services;

import com.project.course.entities.Users;
import com.project.course.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<Users> findAll(){
        return repository.findAll();
    }

    public Users findById (Long id){
        Optional<Users> obj = repository.findById(id);
        return obj.get();
    }

   public Users insert (Users obj){
        return repository.save(obj);
   }

   public void delete (Long id){
        repository.deleteById(id);
   }

   public Users update (Long id,Users obj){
        Users entity = repository.getReferenceById(id);
        updateData( entity,obj);
        return repository.save(entity);
   }

    private void updateData(Users entity, Users obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());


    }

}




