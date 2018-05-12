package com.archit.eventmanagement.controllers;

import com.archit.eventmanagement.entities.Event;
import com.archit.eventmanagement.repos.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// tells Spring that this is a Controller
// & it should be the part of spring data rest
// Unlike @Controller or @RestController, it will derive the base path and
// becomes the part of spring data application.
@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping("/start/{id}")
    public ResponseEntity start(@PathVariable Long id) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event == null) {
            throw new ResourceNotFoundException();
        }
        event.setStarted(true);
        eventRepository.save(event);
        return ResponseEntity.ok(event.getName() + " has started");
    }
}
