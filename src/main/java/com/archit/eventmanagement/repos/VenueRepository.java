package com.archit.eventmanagement.repos;

import com.archit.eventmanagement.entities.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
