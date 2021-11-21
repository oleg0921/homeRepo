package com.epam.spring.homework4.model;

import com.epam.spring.homework4.controller.dto.UserRole;
import lombok.*;
import org.w3c.dom.Entity;

import java.util.Objects;


@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class User  {
    private  Long id;
    private  String firstName;
    private  String lastName;
    private String email;
    private String password;
    private UserRole userRole;
}
