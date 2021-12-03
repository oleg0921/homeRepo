package com.epam.spring.homework5.model;

import com.epam.spring.homework5.controller.dto.Languages;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "start_event")
    private Date startEvent;
    @Column(name = "finish_event")
    private Date finishEvent;
    @Column(name = "location")
    private String location;
    @Column(name = "moderator_id")
    private long moderatorId;
    @Column(name = "name")
    private String nameEvent;
    @Column(name = "languages_id")
    private Long languageId;
}
