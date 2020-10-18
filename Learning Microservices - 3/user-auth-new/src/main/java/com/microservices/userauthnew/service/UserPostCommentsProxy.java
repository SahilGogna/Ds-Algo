package com.microservices.userauthnew.service;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.userauthnew.model.Post;

//@FeignClient(name="user-post-comments")
// now we want the request to go through zuul api
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="user-post-comments")
public interface UserPostCommentsProxy {

	@GetMapping(path = "/user-post-comments/getAllPost/{userId}")
	public ResponseEntity<List<Post>> getAllPost(@PathVariable("userId") int userId);
}
