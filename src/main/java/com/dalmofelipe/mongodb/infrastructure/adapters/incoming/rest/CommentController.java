package com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest;

import java.util.List;

import com.dalmofelipe.mongodb.core.ports.incoming.CommentUseCase;
import com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest.dto.CommentDto;
import com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.comment.CommentMapper;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import jakarta.validation.Valid;

@Controller("/comments")
public class CommentController {

    @Inject
    private CommentUseCase commentUseCase;

    @Post
    public CommentDto save(@Valid @Body CommentDto dto) {
        var comment = CommentMapper.dtoToDomain(dto);

        var commentDb = commentUseCase.save(comment);

        return CommentMapper.domainToDto(commentDb);
    }

    @Get
    public List<CommentDto> findAll() {
        return commentUseCase.findAll().stream()
            .map(CommentMapper::domainToDto).toList(); 
    }

    @Get("/{id}")
    public CommentDto findById(String id) {
        var commentDb = commentUseCase.findById(id);

        return CommentMapper.domainToDto(commentDb);
    }
}
