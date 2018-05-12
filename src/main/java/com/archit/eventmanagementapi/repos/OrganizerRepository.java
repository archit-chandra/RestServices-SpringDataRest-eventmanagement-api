package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
