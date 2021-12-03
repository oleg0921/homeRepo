package com.epam.spring.homework5.model;


import com.epam.spring.homework5.controller.dto.Languages;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "topic")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "topic")
    private String topic;
    @Column(name = "languages_id")
    private Long languageId;
}
