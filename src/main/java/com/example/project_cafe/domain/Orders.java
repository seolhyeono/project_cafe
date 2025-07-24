package com.example.project_cafe.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @Column(length = 20)
    private String phone;

    @Column(nullable = false)
    private LocalDateTime orderTime;

    @Column(nullable = false)
    private Integer totalAmount;

    @Column(nullable = false, length = 50)
    private String status;

    private Integer usedPoint = 0;

    private Integer earnedPoint = 0;

    @Column(nullable = false, length = 20)
    private String orderMethod;
}
