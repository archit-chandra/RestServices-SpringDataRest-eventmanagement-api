package com.archit.eventmanagement.controllers;

import com.archit.eventmanagement.controllers.exceptions.AlreadyCheckedInException;
import com.archit.eventmanagement.entities.Participant;
import com.archit.eventmanagement.repos.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {
    @Autowired
    private ParticipantRepository participantRepository;

    @PostMapping("/checkin/{id}")
    public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id,
                                                            PersistentEntityResourceAssembler assembler) {
        Participant participant = participantRepository.findById(id).orElse(null);
        if (participant != null) {
            if (participant.isCheckedIn()) {
                throw new AlreadyCheckedInException();
            }
            participant.setCheckedIn(true);
            participantRepository.save(participant);
        } else {
            throw new ResourceNotFoundException();
        }
        return ResponseEntity.ok(assembler.toResource(participant));
    }
}
