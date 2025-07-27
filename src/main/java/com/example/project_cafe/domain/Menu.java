package com.example.project_cafe.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Long price;

    private String imageUrl;

    @Column(nullable = false)
    private Long stock = 0L;

    @Column(nullable = false)
    private Boolean isSoldOut = false;
}
