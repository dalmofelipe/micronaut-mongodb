package com.dalmofelipe.mongodb;

import java.util.List;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/comments")
public class CommentController {
    
    @Inject
    private CommentServiceImpl commentService;

    @Post
    public Comment save(@Body Comment comment) {
        return commentService.save(comment);
    }

    @Get
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @Get("/{id}")
    public Comment findById(String id) {
        return commentService.findById(id);
    }

}
