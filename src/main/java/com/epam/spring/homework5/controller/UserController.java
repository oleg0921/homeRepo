package com.epam.spring.homework5.controller;


import com.epam.spring.homework5.controller.dto.UserDto;
import com.epam.spring.homework5.exeption.NotFoundException;
import com.epam.spring.homework5.model.User;
import com.epam.spring.homework5.service.UserService;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/users")
    public List<UserDto> getListUsers() {
        return userService.listUsers()
                .stream()
                .map(u -> dozerBeanMapper.map(u, UserDto.class))
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/user/{id}")
    public UserDto getUser (@PathVariable Long id) {

        User user = new User();
        try{
             user =userService.getUser(id);
        }catch (Exception e){
            System.out.println(e.getCause());
        }

        if(user == null) {
             throw new NotFoundException("Invalid user id : ");
        }
        return dozerBeanMapper.map(userService.getUser(id),UserDto.class);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/user")
    public UserDto createUser(@RequestBody @Valid UserDto userDto) {
        User user = dozerBeanMapper.map(userDto,User.class);
        if(user == null) {
            throw new NotFoundException("Invalid user");
        }
        try{
            userService.createUser(user);
        }catch (Exception e){
            System.out.println(e.getCause());
        }

        return dozerBeanMapper.map(user,UserDto.class);
    }



    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<Void> deleteUser (@PathVariable Long id) {

        User user = userService.getUser(id);
        if(user == null) {
            throw new NotFoundException("Invalid user login : ");
        }
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }



    }



