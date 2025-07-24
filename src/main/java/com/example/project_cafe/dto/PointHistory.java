package com.example.project_cafe.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointHistory extends BaseEntity {

    private Integer pointHistoryId;
    private User user;
    private String phone;
    private Orders order;
    private Integer amount;
    private String pointType;

}
