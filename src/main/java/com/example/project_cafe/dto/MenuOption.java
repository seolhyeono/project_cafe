package com.example.project_cafe.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuOption {

    private Integer optionId;
    private Menu menu;
    private String optionName;
    private Integer optionPrice = 0;
    private String optionType;
}