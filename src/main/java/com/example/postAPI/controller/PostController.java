package com.example.postAPI.controller;

import com.example.postAPI.controller.dto.PostDto;
import com.example.postAPI.repository.PostRepository;
import com.example.postAPI.repository.entity.Post;
import com.example.postAPI.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping()
public class PostController {
    private PostService postService;
    final PostRepository postRepository;


    public PostController(@Autowired PostRepository postRepository, @Autowired PostService postService) {
        this.postRepository = postRepository;
        this.postService = postService;
    }

    @GetMapping("api/post")
    public Iterable<Post> getPosts(){
        return postService.all();
    }


    @PostMapping
    public Post save(@RequestBody PostDto postDto) {
        return postService.save(new Post(postDto));
    }
    @GetMapping("/{id}")
    public Post findPostById (@PathVariable Integer id) {
        return postService.findById(id);
    }
    @PutMapping( "/{id}" )
    public Post update( @RequestBody PostDto postDto, @PathVariable Integer id )
    {
        Post post = postService.findById(id);
        post.setTitle(postDto.getTitle());
        post.setAuthor(postDto.getAuthor());
        post.setDate(postDto.getDate());
        post.setText(postDto.getText());
        post.setImageUrl(postDto.getImageUrl() );
        return postService.save(post);
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        postService.delete(id);
    }

}
