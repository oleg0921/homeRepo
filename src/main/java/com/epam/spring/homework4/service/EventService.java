package com.epam.spring.homework4.service;

import com.epam.spring.homework4.model.Event;
import com.epam.spring.homework4.model.Report;

import java.util.List;

public interface EventService {



    Event getEvent (Long id);

    List<Event> getEvents ();

    void createEvent (Event event);

    void updateEvent (Long id, Event event);

    void deleteEvent (Long id);
}
