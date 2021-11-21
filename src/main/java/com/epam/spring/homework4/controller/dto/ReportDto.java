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
public class ReportDto {
    private Long id;
    private String topic;
    private Languages languages;

}
