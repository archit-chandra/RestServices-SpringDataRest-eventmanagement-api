package com.archit.eventmanagement.repos;

import com.archit.eventmanagement.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import java.time.ZoneId;

// Add below annotation only when using excerpts
// used when collection of events through finder methods to use this projection
//@RepositoryRestResource(excerptProjection = PartialEventProjection.class)
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

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteById(Long id);
}
