package com.example.project_cafe.repository;

import com.example.project_cafe.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByMenu_MenuIdAndOption_OptionId(Long menuId, Long optionId);
}