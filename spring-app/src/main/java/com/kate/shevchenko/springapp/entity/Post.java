package com.kate.shevchenko.springapp.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String postTitle;
    private String postContent;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Post(Long postId, String postTitle, String postContent) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.postContent = postContent;
    }

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", postContent='" + postContent + '\'' +
                '}';
    }
}
