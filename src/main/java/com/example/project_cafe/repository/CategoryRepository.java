package com.example.project_cafe.repository;

import com.example.project_cafe.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}