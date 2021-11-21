package com.epam.spring.homework4.controller;


import com.epam.spring.homework4.controller.dto.EventDto;
import com.epam.spring.homework4.controller.dto.ReportDto;
import com.epam.spring.homework4.model.Event;
import com.epam.spring.homework4.service.EventService;
import lombok.RequiredArgsConstructor;
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

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/events")
    public List<EventDto> getAllTopics() {
        return topicService.getEvents()
                .stream()
                .map(this::mapTopicToTopicDto)
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/event/{id}")
    public EventDto getTopic(@PathVariable Long id) {
        return mapTopicToTopicDto(topicService.getEvent(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/event")
    public EventDto createTopic(@RequestBody EventDto topicDto) {
        Event topic = mapTopicDtoToTopic(topicDto);
        topicService.createEvent(topic);
        return mapTopicToTopicDto(topic);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/event/{id}")
    public EventDto updateTopic(@PathVariable Long id, @RequestBody EventDto topicDto) {
        Event topic = mapTopicDtoToTopic(topicDto);
        topicService.updateEvent(id, topic);
        return mapTopicToTopicDto(topicService.getEvent(id));
    }

    @DeleteMapping(value = "/event/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable int id) {
        topicService.deleteEvent((long) id);
        return ResponseEntity.noContent().build();
    }


    private EventDto mapTopicToTopicDto(Event topic) {
        return EventDto.builder()
                .id(topic.getId())
                .startEvent(topic.getStartEvent())
                .finishEvent(topic.getFinishEvent())
                .location(topic.getLocation())
                .moderatorId(topic.getModeratorId())
                .nameEvent(topic.getNameEvent())
                .languageEvent(topic.getLanguageEvent())
                .build();
    }

    private Event mapTopicDtoToTopic(EventDto topicDto) {
        return Event.builder()
                .id(topicDto.getId())
                .startEvent(topicDto.getStartEvent())
                .finishEvent(topicDto.getFinishEvent())
                .location(topicDto.getLocation())
                .moderatorId(topicDto.getModeratorId())
                .nameEvent(topicDto.getNameEvent())
                .languageEvent(topicDto.getLanguageEvent())
                .build();

    }
}
