package com.example.project_cafe.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Cart extends BaseEntity {

    private Integer cartId;
    private String phone;
    private Menu menu;
    private MenuOption option;
    private Integer quantity = 1;
}
