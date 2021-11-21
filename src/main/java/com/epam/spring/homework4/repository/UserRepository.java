package com.epam.spring.homework4.repository;

import com.epam.spring.homework4.model.User;

import java.util.List;

public interface UserRepository {
    User getEntity (Long id);

    List<User> getEntities ();

    Long createEntity (User user);

    void updateEntity (Long id, User user);

    void deleteEntity (Long login);
}

