package com.epam.spring.homework5.repository;

import com.epam.spring.homework5.model.Report;

import java.util.List;

public interface ReportRepository {

    Report getEntity (Long id);

    List<Report> getEntities ();

    Long createEntity (Report user);

    void updateEntity (Long id, Report user);

    void deleteEntity (Long login);
}
