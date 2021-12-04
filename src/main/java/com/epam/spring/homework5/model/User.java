package com.epam.spring.homework5.model;

import com.epam.spring.homework5.controller.dto.UserRole;
import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Table(name = "user", schema="variant3schema")
@NoArgsConstructor
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private  Long id;
    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private  String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "role_id")
    private Long idRole;

}
