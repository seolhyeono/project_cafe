package com.example.project_cafe.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private Integer orderItemId;
    private Orders order;
    private Menu menu;
    private MenuOption option;
    private Integer quantity = 1;
    private Integer price;
}
