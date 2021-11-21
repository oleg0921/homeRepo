package com.epam.spring.homework4.model;


import com.epam.spring.homework4.controller.dto.Languages;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Report {

    private Long id;
    private String topic;
    private Languages languages;
}
