package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
