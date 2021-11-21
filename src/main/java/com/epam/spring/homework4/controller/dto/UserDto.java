package com.epam.spring.homework4.controller.dto;


import lombok.*;

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
    private String email;
    private String password;
    private UserRole userRole;
}
