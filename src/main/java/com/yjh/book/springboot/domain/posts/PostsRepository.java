package com.yjh.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query(value = "SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

    List<Posts> findByClassification(String classification);
}
