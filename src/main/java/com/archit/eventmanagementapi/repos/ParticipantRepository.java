package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
