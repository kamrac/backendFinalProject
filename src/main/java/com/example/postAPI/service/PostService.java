package com.example.postAPI.service;

import com.example.postAPI.repository.PostRepository;
import com.example.postAPI.repository.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(@Autowired PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public Post save(Post post) {
        //TODO implement this method
        return null;
    }

    public void delete(int postId) {
        //TODO implement this method
    }

    public Post findById(int postId) {
        //TODO implement this method
        return null;
    }
}
