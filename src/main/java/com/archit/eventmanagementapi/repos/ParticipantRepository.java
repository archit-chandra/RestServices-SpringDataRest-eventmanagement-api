package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
