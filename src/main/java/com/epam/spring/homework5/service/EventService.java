package com.epam.spring.homework5.service;

import com.epam.spring.homework5.model.Event;

import java.util.List;

public interface EventService {



    Event getEvent (Long id);

    List<Event> getEvents ();

    void createEvent (Event event);

    void updateEvent (Long id, Event event);

    void deleteEvent (Long id);
}
