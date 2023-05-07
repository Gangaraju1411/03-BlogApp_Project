package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Comments;

public interface CommentsRepo extends JpaRepository<Comments, Integer> {

}
