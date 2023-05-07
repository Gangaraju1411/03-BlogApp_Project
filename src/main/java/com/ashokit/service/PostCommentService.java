package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ashokit.binding.CommentsForm;
import com.ashokit.binding.CreatePostForm;
import com.ashokit.entity.Comments;
import com.ashokit.entity.CreatePostDetails;

@Component
	public interface PostCommentService {

	public String savePost (CreatePostForm form);
	
	public  List<CreatePostDetails>  getPosts();
	
	public String addComment (CommentsForm form, Integer blogId);
	
	public List<Comments> retrieveComments();
	
    public void softDelete(Integer blogId) ;
    
    public List<CreatePostDetails> getActivePersons() ;



}
