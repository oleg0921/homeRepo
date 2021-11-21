package com.epam.spring.homework4.service;
import com.epam.spring.homework4.model.Report;

import java.util.List;

public interface ReportService {

    Report getReport(Long id);

    List<Report> getReports();

    void createReport (Report report);

    void updateReport (Long id, Report report);

    void deleteReport (Long id);
}
