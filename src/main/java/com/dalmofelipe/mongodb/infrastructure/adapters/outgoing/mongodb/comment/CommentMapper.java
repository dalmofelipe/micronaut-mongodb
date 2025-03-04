package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.comment;

import com.dalmofelipe.mongodb.core.domain.Comment;
import com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest.dto.CommentDto;

public class CommentMapper {
    
    public static CommentEntity domainToEntity(Comment domain) {
        CommentEntity entity = new CommentEntity();
        entity.setId(domain.getId());
        entity.setContent(domain.getContent());
        entity.setAuthor(domain.getAuthor());
        return entity;
    }

    public static CommentDto domainToDto(Comment domain) {
        CommentDto dto = new CommentDto();
        dto.setId(domain.getId());
        dto.setContent(domain.getContent());
        dto.setAuthor(domain.getAuthor());
        return dto;
    }

    public static Comment entityToDomain(CommentEntity entity) {
        Comment comment = new Comment();
        comment.setId(entity.getId());
        comment.setContent(entity.getContent());
        comment.setAuthor(entity.getAuthor());
        return comment;
    }

    public static CommentDto entityToDto(CommentEntity entity) {
        CommentDto dto = new CommentDto();
        dto.setId(entity.getId());
        dto.setContent(entity.getContent());
        dto.setAuthor(entity.getAuthor());
        return dto;
    }

    public static CommentEntity dtoToEntity(CommentDto dto) {
        CommentEntity entity = new CommentEntity();
        entity.setId(dto.getId());
        entity.setContent(dto.getContent());
        entity.setAuthor(dto.getAuthor());
        return entity;
    }

    public static Comment dtoToDomain(CommentDto dto) {
        Comment comment = new Comment();
        comment.setId(dto.getId());
        comment.setContent(dto.getContent());
        comment.setAuthor(dto.getAuthor());
        return comment;
    }
}
