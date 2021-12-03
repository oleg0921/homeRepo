package com.epam.spring.homework5.controller;


import com.epam.spring.homework5.controller.dto.EventDto;
import com.epam.spring.homework5.exeption.NotFoundException;
import com.epam.spring.homework5.model.Event;
import com.epam.spring.homework5.service.EventService;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class EventController {

    @Autowired
    private EventService topicService;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/events")
    public List<EventDto> getAllTopics() {
        return topicService.getEvents()
                .stream()
                .map(e -> dozerBeanMapper.map(e,EventDto.class))
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/event/{id}")
    public EventDto getTopic(@PathVariable Long id) {
        Event event = topicService.getEvent(id);
        if (event == null){
            throw new NotFoundException("Invalid event id : ");
        }
        return dozerBeanMapper.map(event,EventDto.class);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/event")
    public EventDto createTopic(@RequestBody EventDto topicDto) {
        Event event = dozerBeanMapper.map(topicDto,Event.class);
        if (event == null){
            throw new NotFoundException("Invalid event id : ");
        }
        topicService.createEvent(event);
        return dozerBeanMapper.map(event,EventDto.class);
    }


    @DeleteMapping(value = "/event/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable int id) {
        Event event = topicService.getEvent((long) id);
        if (event == null){
            throw new NotFoundException("Invalid event  : ");
        }
        topicService.deleteEvent((long) id);
        return ResponseEntity.noContent().build();
    }

}
