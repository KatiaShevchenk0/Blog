package com.kate.shevchenko.springapp.repository;


import com.kate.shevchenko.springapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository <Post, Long>{
}
