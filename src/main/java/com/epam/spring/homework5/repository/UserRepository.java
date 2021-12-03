package com.epam.spring.homework5.repository;

import com.epam.spring.homework5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}

