package com.example.postAPI.controller;

import com.example.postAPI.repository.PostRepository;
import com.example.postAPI.repository.entity.Post;
import com.example.postAPI.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/post")
public class PostController {
    private PostService postService;
    final PostRepository postRepository;

    public PostController(@Autowired PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public Iterable<Post> getPosts(){
        return postRepository.findAll();
    }
}
