package com.epam.spring.homework5.controller.dto;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
     @NotBlank
    private String topic;
    @NotBlank
    private Languages languages;

}
