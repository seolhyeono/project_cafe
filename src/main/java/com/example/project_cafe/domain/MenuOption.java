package com.example.project_cafe.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu_option")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @Column(nullable = false, length = 100)
    private String optionName;

    @Column(nullable = false)
    private Long optionPrice = 0L;

    @Column(length = 50)
    private String optionType;
}