package com.epam.spring.homework5.controller.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    @NotBlank
    private Date startEvent;
    @NotBlank
    private Date finishEvent;
    @NotBlank
    private String location;
    @NotBlank
    private long moderatorId;
    @NotBlank
    private String nameEvent;
    @NotBlank
    private Languages languageEvent;

}
