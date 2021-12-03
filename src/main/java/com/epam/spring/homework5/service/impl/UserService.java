package com.epam.spring.homework5.service.impl;

import com.epam.spring.homework5.model.User;
import com.epam.spring.homework5.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements com.epam.spring.homework5.service.UserService {

    @Autowired
    private final UserRepository userRepository;
    @Override
    public User getUser (Long id) {
        log.info("getUser by id {}", id);
        return userRepository.getById(id);
    }

    @Override
    public List<User> listUsers () {
        log.info("getUser all user ");
        return userRepository.findAll();
    }

    @Override
    public void createUser (User user) {
        log.info("getUser by id {}", user.getId());
         userRepository.save(user);
    }



    @Override
    public void deleteUser (Long id) {
        userRepository.deleteById(id);
    }
}
