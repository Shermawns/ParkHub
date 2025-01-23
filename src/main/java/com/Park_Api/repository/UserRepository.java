package com.Park_Api.repository;
import com.Park_Api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String name);
    boolean existsByUsername(String username);
}
