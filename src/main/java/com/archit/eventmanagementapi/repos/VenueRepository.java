package com.archit.eventmanagementapi.repos;

import com.archit.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
