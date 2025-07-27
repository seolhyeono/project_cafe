package com.example.project_cafe.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class BaseEntityDTO {
    private LocalDateTime modifiedAt;
    private LocalDateTime createdAt;
}
