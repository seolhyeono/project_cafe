package com.example.project_cafe.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)

public class BaseEntity {

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

}
