package com.example.postAPI.service;

import com.example.postAPI.repository.PostRepository;
import com.example.postAPI.repository.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService{
    private final PostRepository postRepository;

    public PostService(@Autowired PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public Post save(Post post) {
        //TODO implement this method
        return postRepository.save(post);
    }

    public void delete(int postId) {
        //TODO implement this method
        postRepository.deleteById(postId);
    }

    public List<Post> all()
    {
        //TODO implement this method
        return postRepository.findAll();
    }

    public Post findById(int postId) {
        //TODO implement this method
        Optional<Post> post = postRepository.findById(postId);
        return post.get();
    }

}
