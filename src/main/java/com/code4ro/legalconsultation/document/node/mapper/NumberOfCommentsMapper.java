package com.code4ro.legalconsultation.document.node.mapper;

import com.code4ro.legalconsultation.document.node.model.dto.DocumentNodeDto;
import com.code4ro.legalconsultation.document.node.model.persistence.DocumentNode;
import com.code4ro.legalconsultation.comment.repository.CommentRepository;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class NumberOfCommentsMapper {

    @Autowired
    private CommentRepository commentRepository;

    @AfterMapping
    public void computeNumberOfComments(@MappingTarget DocumentNodeDto dto, DocumentNode model) {
        dto.setNumberOfComments(commentRepository.countByDocumentNodeId(model.getId()));
    }
}


