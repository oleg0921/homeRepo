package com.epam.spring.homework4.service;

import com.epam.spring.homework4.model.User;

import java.util.List;

public interface UserService {


    User getUser(Long id);

    List<User> listUsers();

    void createUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
