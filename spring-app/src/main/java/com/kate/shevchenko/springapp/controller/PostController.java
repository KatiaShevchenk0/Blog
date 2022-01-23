package com.kate.shevchenko.springapp.controller;


import com.kate.shevchenko.springapp.entity.Post;
import com.kate.shevchenko.springapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/api/v1/posts")
    public Post savePost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/api/v1/posts")
    public List<Post> fetchPostList() {
        return postService.fetchPostList();
    }

    @GetMapping("/api/v1//posts/{id}")
    public Post fetchPostById(@PathVariable("id") Long postId) {
        return postService.fetchPostById(postId);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public String deletePostById(@PathVariable("id") Long postId) {
        postService.deletePostById(postId);
        return "Post deleted Successfully!!";
    }

    @PutMapping("/api/v1/posts/{id}")
    public Post updatePost(@PathVariable("id") Long postId,
                           @RequestBody Post post) {
        return postService.updatePost(postId, post);
    }

    @GetMapping("/api/v1/posts/title/{title}")
    public Post searchPostByName(@PathVariable("title") String postTitle) {
        return postService.searchPostByName(postTitle);
    }


    @GetMapping("/api/v1/posts?sort=title")
    public List<Post> sortByTitle(@RequestParam(value = "postTitle", required = false) String postTitle,
                                  @RequestParam(value = "sort", required = false) Sort.Direction sort){
        return postService.sortByTitle(postTitle, sort);
    }

}


