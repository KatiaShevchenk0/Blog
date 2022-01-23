package com.kate.shevchenko.springapp.repository;


import com.kate.shevchenko.springapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository <Post, Long>{
     public Post findByPostTitle(String postTitle);
     public Post findByPostTitleIgnoreCase(String postTitle);

    public List<Post> sortByTitle(String postTitle);

}
