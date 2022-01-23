package com.kate.shevchenko.springapp.service;

import com.kate.shevchenko.springapp.entity.Post;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public Post savePost(Post post);

    public List<Post> fetchPostList();

    public Post fetchPostById(Long postId);

    public void deletePostById(Long postId);

    public Post updatePost(Long postId, Post post);

   public Post searchPostByName(String postTitle);

    List<Post> sortByTitle(String title, Sort.Direction sort);

}

