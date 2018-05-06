package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
