package com.archit.eventmanagement.repos;

import com.archit.eventmanagement.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.time.ZoneId;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

    /**
     * findOne(), findAll() are already provided for the given Entity
     */

    //List<Event> findByName(@Param("name") String name);

    Page<Event> findByName(@Param("name") String name, Pageable pageable);

    Page<Event> findByNameAndZoneId(
            @Param("name") String name,
            @Param("zoneId") ZoneId zoneId,
            Pageable pageable);
}