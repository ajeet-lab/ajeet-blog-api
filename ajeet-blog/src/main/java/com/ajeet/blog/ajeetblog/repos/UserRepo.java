package com.ajeet.blog.ajeetblog.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajeet.blog.ajeetblog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
}
