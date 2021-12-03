package com.epam.spring.homework5.controller;


import com.epam.spring.homework5.controller.dto.ReportDto;
import com.epam.spring.homework5.controller.dto.UserDto;
import com.epam.spring.homework5.exeption.NotFoundException;
import com.epam.spring.homework5.model.Report;
import com.epam.spring.homework5.model.User;
import com.epam.spring.homework5.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
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

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/report")
    public List<ReportDto> getAllTopics() {
        return reportService.getReports()
                .stream()
                .map(u -> dozerBeanMapper.map(u, ReportDto.class))
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/report/{id}")
    public ReportDto getTopic(@PathVariable Long id) {
        Report report = reportService.getReport(id);
        if (report == null){
            throw new NotFoundException("Invalid report id : ");
        }
        return dozerBeanMapper.map(report,ReportDto.class);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/report")
    public ReportDto createTopic(@RequestBody @Valid ReportDto topicDto) {
        Report report = dozerBeanMapper.map(topicDto,Report.class);
        if (report == null){
            throw new NotFoundException("Invalid report  : ");
        }
        reportService.createReport(report);
        return dozerBeanMapper.map(report,ReportDto.class);

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

}
