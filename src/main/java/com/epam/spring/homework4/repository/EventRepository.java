package com.epam.spring.homework4.repository;

import com.epam.spring.homework4.model.Event;

import java.util.List;

public interface EventRepository {
    Event getEntity (Long id);

    List<Event> getEntities ();

    Long createEntity (Event user);

    void updateEntity (Long id, Event user);

    void deleteEntity (Long login);

}
