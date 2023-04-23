package com.ajeet.blog.ajeetblog.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajeet.blog.ajeetblog.entities.Category;

public interface CateRepo extends JpaRepository<Category, Integer> {
    
}
