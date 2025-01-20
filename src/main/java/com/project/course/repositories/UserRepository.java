package com.project.course.repositories;

import com.project.course.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long > {
}
