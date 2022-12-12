package com.example.postAPI.repository;


import com.example.postAPI.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
}

