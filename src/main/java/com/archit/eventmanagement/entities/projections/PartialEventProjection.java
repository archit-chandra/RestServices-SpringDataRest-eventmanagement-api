package com.archit.eventmanagement.entities.projections;

import com.archit.eventmanagement.entities.Event;
import org.springframework.data.rest.core.config.Projection;

import java.time.Instant;
import java.time.ZonedDateTime;

// NOTES: @Projection
//  1. To create custom views of the models
//  2. Similarly, excerpts are projections which we apply as default views to resource collections.
//  3. https://www.baeldung.com/spring-data-rest-projections-excerpts
@Projection(name = "partial", types = {Event.class})
public interface PartialEventProjection {

    String getName();

    ZonedDateTime getStartTime();

    ZonedDateTime getEndTime();

    //exposing hidden data, marked as @JsonIgnore
    Instant getCreated();
}
