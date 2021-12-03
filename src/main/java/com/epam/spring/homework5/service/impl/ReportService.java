package com.epam.spring.homework5.service.impl;

import com.epam.spring.homework5.model.Report;
import com.epam.spring.homework5.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class ReportService  implements com.epam.spring.homework5.service.ReportService {

    @Autowired
     private final ReportRepository reportRepository;
    @Override
    public Report getReport (Long id) {
        return reportRepository.getById(id);
    }

    @Override
    public List<Report> getReports () {
        return reportRepository.findAll();
    }

    @Override
    public void createReport (Report report) {
         reportRepository.save(report);
    }


    @Override
    public void deleteReport (Long id) {
        reportRepository.deleteById(id);
    }
}
