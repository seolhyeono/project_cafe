package com.example.project_cafe.repository;

import com.example.project_cafe.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, String> {
    Optional<Admin> findByAdminIdAndAdminPw(String adminId, String adminPw);
}