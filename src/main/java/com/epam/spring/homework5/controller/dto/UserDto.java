package com.epam.spring.homework5.controller.dto;


import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class UserDto {


    private  Long id;
    private  String firstName;
    private  String lastName;
    @Email
    private String email;
    @NotBlank
    private String password;
    private UserRole userRole;
}
