package com.example.project_cafe.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminLog extends BaseEntity {
    private Integer logId;
    private Admin admin;
    private String actionType;
    private String targetTable;
    private Integer targetId;
}
