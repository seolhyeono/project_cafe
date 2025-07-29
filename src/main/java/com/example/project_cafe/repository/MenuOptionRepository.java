package com.example.project_cafe.repository;

import com.example.project_cafe.domain.MenuOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuOptionRepository extends JpaRepository<MenuOption, Long> {
    List<MenuOption> findByCategory_CategoryId(Long categoryId);
}