package com.epam.spring.homework5.service;

import com.epam.spring.homework5.model.User;

import java.util.List;

public interface UserService {


    User getUser(Long id);

    List<User> listUsers();

    void createUser(User user);


    void deleteUser(Long id);
}
