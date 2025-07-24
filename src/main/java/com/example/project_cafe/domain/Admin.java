package com.example.project_cafe.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends BaseEntity{

    @Id
    @Column(length = 20)
    private String adminId;

    @Column(length = 40)
    private String adminPw;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private AdminRole adminRole;

    public enum AdminRole {
        STAFF, MANAGER, CEO
    }
}
