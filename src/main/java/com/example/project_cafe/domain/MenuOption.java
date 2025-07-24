package com.example.project_cafe.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "menuOption")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer optionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuId", nullable = false)
    private Menu menu;

    @Column(nullable = false, length = 100)
    private String optionName;

    @Column(nullable = false)
    private Integer optionPrice = 0;

    @Column(length = 50)
    private String optionType;
}