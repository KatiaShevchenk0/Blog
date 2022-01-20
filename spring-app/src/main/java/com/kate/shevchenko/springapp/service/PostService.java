package com.kate.shevchenko.springapp.service;

import com.kate.shevchenko.springapp.entity.Post;

import java.util.List;

public interface PostService {
    public Post savePost(Post post);

    public List<Post> fetchPostList();

    public Post fetchPostById(Long postId);

    public void deletePostById(Long postId);

    public Post updatePost(Long postId, Post post);
}

