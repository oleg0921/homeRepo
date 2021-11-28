package com.epam.spring.homework5.controller;


import com.epam.spring.homework5.controller.dto.ReportDto;
import com.epam.spring.homework5.exeption.NotFoundException;
import com.epam.spring.homework5.model.Report;
import com.epam.spring.homework5.model.User;
import com.epam.spring.homework5.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ReportController {

    @Autowired
    private ReportService reportService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/report")
    public List<ReportDto> getAllTopics() {
        return reportService.getReports()
                .stream()
                .map(this::mapReportToReportdtoDto)
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/report/{id}")
    public ReportDto getTopic(@PathVariable Long id) {
        Report report = reportService.getReport(id);
        if (report == null){
            throw new NotFoundException("Invalid report id : ");
        }
        return mapReportToReportdtoDto(report);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/report")
    public ReportDto createTopic(@RequestBody @Valid ReportDto topicDto) {
        Report report = mapTopicDtoToTopic(topicDto);
        if (report == null){
            throw new NotFoundException("Invalid report  : ");
        }
        reportService.createReport(report);
        return mapReportToReportdtoDto(report);

    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/report/{id}")
    public ReportDto updateTopic(@PathVariable Long id, @RequestBody @Valid ReportDto topicDto) {
        Report report = mapTopicDtoToTopic(topicDto);
        if (report == null){
            throw new NotFoundException("Invalid report id : ");
        }
        reportService.updateReport(id, report);
        return mapReportToReportdtoDto(reportService.getReport(id));
    }

    @DeleteMapping(value = "/report/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {

        Report user = reportService.getReport(id);
        if(user == null) {
            throw new NotFoundException("Invalid user login : ");
        }
        reportService.deleteReport(id);
        return ResponseEntity.noContent().build();
    }


    private ReportDto mapReportToReportdtoDto (Report topic) {
        return ReportDto.builder()
                .id(topic.getId())
                .topic(topic.getTopic())
                .languages(topic.getLanguages())
                .build();

    }

    private Report mapTopicDtoToTopic(ReportDto topicDto) {
        return Report.builder()
                .id(topicDto.getId())
                .topic(topicDto.getTopic())
                .languages(topicDto.getLanguages())
                .build();
    }
}
