package com.example.project_cafe.repository;

import com.example.project_cafe.domain.User;
import com.example.project_cafe.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhone(String phone);
}
