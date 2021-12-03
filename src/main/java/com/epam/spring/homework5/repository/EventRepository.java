package com.epam.spring.homework5.repository;

import com.epam.spring.homework5.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
}
