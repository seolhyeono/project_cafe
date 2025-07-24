package com.example.project_cafe.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data

public class BaseEntity {
    private LocalDateTime modifiedAt;
    private LocalDateTime createdAt;
}
