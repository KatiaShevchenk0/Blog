package com.kate.shevchenko.springapp.service;

import com.kate.shevchenko.springapp.entity.Post;
import com.kate.shevchenko.springapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;


    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> fetchPostList() {
        return postRepository.findAll();
    }

    @Override
    public Post fetchPostById(Long postId) {
        return postRepository.findById(postId).get();
    }

    @Override
    public void deletePostById(Long postId) {
        postRepository.deleteById(postId);
    }

    @Override
    public Post updatePost(Long postId, Post post) {
        Post postDB = postRepository.findById(postId).get();

        if (Objects.nonNull(post.getPostTitle()) &&
                !"".equalsIgnoreCase(post.getPostTitle())) {
            postDB.setPostTitle(post.getPostTitle());
        }

        if (Objects.nonNull(post.getPostContent()) &&
                !"".equalsIgnoreCase(post.getPostContent())) {
            postDB.setPostContent(post.getPostContent());
        }
        return postRepository.save(postDB);
    }

    @Override
    public Post searchPostByName(String postTitle) {
        return postRepository.findByPostTitleIgnoreCase(postTitle);
    }

    @Override
    public List<Post> sortByTitle(String postTitle, Sort.Direction sort){

        if (postTitle != null){
            return postRepository.sortByTitle(postTitle);
        } else if (sort != null){
            return postRepository.findAll(Sort.by(sort, "postTitle"));
        }
        return postRepository.findAll();
    }

}
