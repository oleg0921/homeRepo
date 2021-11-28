package com.epam.spring.homework5.repository.impl;

import com.epam.spring.homework5.model.Event;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class EventRepository implements com.epam.spring.homework5.repository.EventRepository {

    private final List<Event> events = new ArrayList<>();
    private static Long id = 0l;
    @Override
    public Event getEntity (Long id) {
        return events.stream()
                .filter(event -> event.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Event is not found!"));
    }

    @Override
    public List<Event> getEntities () {
        return events;
    }

    @Override
    public Long createEntity (Event user) {
        user.setId(id);
        events.add(user);
        id++;
        return id;
    }

    @Override
    public void updateEntity (Long id, Event user) {
        events.set(Math.toIntExact(id), user);
    }

    @Override
    public void deleteEntity (Long login) {
        events.removeIf(user -> user.getId().equals(login));
    }
}
