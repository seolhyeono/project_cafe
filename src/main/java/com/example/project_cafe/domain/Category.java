package com.example.project_cafe.domain;

import jakarta.persistence.*;
import lombok.*;


import java.awt.*;
import java.util.ArrayList;

@Entity
@Getter
@Table(name = "category")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(nullable = false, length = 100)
    private String name;

    private String description;

}