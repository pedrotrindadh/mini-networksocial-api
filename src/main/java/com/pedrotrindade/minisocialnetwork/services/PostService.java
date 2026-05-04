package com.pedrotrindade.minisocialnetwork.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrotrindade.minisocialnetwork.domain.Post;
import com.pedrotrindade.minisocialnetwork.repositories.PostRepository;
import com.pedrotrindade.minisocialnetwork.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		return postRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
