package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
