package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

}
