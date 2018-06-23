package com.archit.eventmanagement.repos;

import com.archit.eventmanagement.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
