package com.epam.spring.homework5.model;

import com.epam.spring.homework5.controller.dto.UserRole;
import lombok.*;


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
