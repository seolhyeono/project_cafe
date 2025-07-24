package com.example.project_cafe.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Entity
@Table(name = "adminLog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminLog extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adminId", nullable = false)
    private Admin admin;

    @Column(length = 50)
    private String actionType;

    @Column(length = 50)
    private String targetTable;

    private Integer targetId;
}
