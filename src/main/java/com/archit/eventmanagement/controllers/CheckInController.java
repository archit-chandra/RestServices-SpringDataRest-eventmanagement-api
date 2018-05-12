package com.archit.eventmanagement.controllers;

import com.archit.eventmanagement.entities.Participant;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {

    @PostMapping("/checkin/{id}")
    public ResponseEntity<Participant> checkIn(@PathVariable Long id) {
        return null;
    }
}
