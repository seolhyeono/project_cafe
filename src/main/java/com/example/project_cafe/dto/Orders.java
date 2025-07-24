package com.example.project_cafe.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer orderId;
    private String phone;
    private LocalDateTime orderTime;
    private Integer totalAmount;
    private String status;
    private Integer usedPoint = 0;
    private Integer earnedPoint = 0;
    private String orderMethod;
}
