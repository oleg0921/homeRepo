package com.epam.spring.homework5.service;
import com.epam.spring.homework5.model.Report;

import java.util.List;

public interface ReportService {

    Report getReport(Long id);

    List<Report> getReports();

    void createReport (Report report);


    void deleteReport (Long id);
}
