package com.epam.spring.homework4.repository.impl;

import com.epam.spring.homework4.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserRepository implements com.epam.spring.homework4.repository.UserRepository {

    private final List<User> users = new ArrayList<>();
    private static Long id = 0l;
    @Override
    public User getEntity (Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User is not found!"));
    }

    @Override
    public List<User> getEntities () {
        return users;
    }

    @Override
    public Long createEntity (User user) {
        user.setId(id);
        users.add(user);
        id++;
        return id;
    }

    @Override
    public void updateEntity (Long id, User user) {
        users.set(Math.toIntExact(id), user);
    }

    @Override
    public void deleteEntity (Long login) {
        users.removeIf(user -> user.getId().equals(login));
    }
}
