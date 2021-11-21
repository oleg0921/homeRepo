package com.epam.spring.homework4.repository.impl;

import com.epam.spring.homework4.model.Report;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class ReportRepository implements com.epam.spring.homework4.repository.ReportRepository {

    private final List<Report> reports = new ArrayList<>();
    private static Long id = 0l;
    @Override
    public Report getEntity (Long id) {
        return reports.stream()
                .filter(report -> report.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Report is not found!"));
    }

    @Override
    public List<Report> getEntities () {
        return reports;
    }

    @Override
    public Long createEntity (Report user) {
        user.setId(id);
        reports.add(user);
        id++;
        return id;
    }

    @Override
    public void updateEntity (Long id, Report user) {
        reports.set(Math.toIntExact(id), user);
    }

    @Override
    public void deleteEntity (Long login) {
        reports.removeIf(user -> user.getId().equals(login));
    }
}
