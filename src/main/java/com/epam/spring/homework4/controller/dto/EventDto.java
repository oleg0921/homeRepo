package com.epam.spring.homework4.controller.dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class EventDto {

    private Long id;
    private Date startEvent;
    private Date finishEvent;
    private String location;
    private long moderatorId;
    private String nameEvent;
    private Languages languageEvent;

}
