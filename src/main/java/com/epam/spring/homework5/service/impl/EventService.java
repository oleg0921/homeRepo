package com.epam.spring.homework5.service.impl;

import com.epam.spring.homework5.model.Event;
import com.epam.spring.homework5.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class EventService implements com.epam.spring.homework5.service.EventService {

    @Autowired
    private final EventRepository eventRepository;

    @Override
    public Event getEvent (Long id) {
        return eventRepository.getById(id);
    }

    @Override
    public List<Event> getEvents () {
        return eventRepository.findAll();
    }

    @Override
    public void createEvent (Event event) {

        eventRepository.save(event);
    }


    @Override
    public void deleteEvent (Long id) {
        eventRepository.deleteById(id);
    }
}
