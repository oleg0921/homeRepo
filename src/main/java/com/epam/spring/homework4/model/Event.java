package com.epam.spring.homework4.model;

import com.epam.spring.homework4.controller.dto.Languages;
import lombok.*;

import java.util.Date;
import java.util.Objects;


@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Event {
    private Long id;
    private Date startEvent;
    private Date finishEvent;
    private String location;
    private long moderatorId;
    private String nameEvent;
    private Languages languageEvent;
}
