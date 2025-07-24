package com.example.project_cafe.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends BaseEntity {

    private String adminId;
    private String adminPw;
    private AdminRole adminRole;
    public enum AdminRole {
        STAFF, MANAGER, CEO
    }
}
