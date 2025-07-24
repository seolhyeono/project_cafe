package com.example.project_cafe.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private Integer menuId;
    private Category category;
    private String name;
    private Integer price;
    private String imageUrl;
    private Integer stock = 0;
    private Boolean isSoldOut = false;
}
