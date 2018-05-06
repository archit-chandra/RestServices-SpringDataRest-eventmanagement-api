package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {
}
