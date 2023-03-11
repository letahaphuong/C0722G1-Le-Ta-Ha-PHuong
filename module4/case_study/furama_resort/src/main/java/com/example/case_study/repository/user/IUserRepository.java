package com.example.case_study.repository.user;


import com.example.case_study.model.user_role.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
