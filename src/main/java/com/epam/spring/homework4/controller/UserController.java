package com.epam.spring.homework4.controller;


import com.epam.spring.homework4.controller.dto.UserDto;
import com.epam.spring.homework4.controller.dto.UserRole;
import com.epam.spring.homework4.model.User;
import com.epam.spring.homework4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/users")
    public List<UserDto> getListUsers() {
        return userService.listUsers()
                .stream()
                .map(this::mapUserToUserDto)
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/user/{id}")
    public UserDto getUser (@PathVariable Long id) {
        return mapUserToUserDto(userService.getUser(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/user")
    public UserDto createUser(@RequestBody UserDto userDto) {
        User user = mapUserDtoToUser(userDto);
        userService.createUser(user);
        return mapUserToUserDto(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/user/{id}")
    public UserDto updateUser(@PathVariable Long login, @RequestBody UserDto userDto) {
        User user = mapUserDtoToUser(userDto);
        userService.updateUser(login, user);
        return mapUserToUserDto(user);
    }

    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<Void> deleteConference(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    private User mapUserDtoToUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .userRole(userDto.getUserRole())
                .build();
    }

    private UserDto mapUserToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .userRole(user.getUserRole())
                .build();
    }


    }



