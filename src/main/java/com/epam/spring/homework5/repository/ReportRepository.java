package com.epam.spring.homework5.repository;

import com.epam.spring.homework5.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
