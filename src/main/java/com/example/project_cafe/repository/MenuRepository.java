package com.example.project_cafe.repository;

import com.example.project_cafe.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByCategory_CategoryId(Long categoryId);
}