package com.archit.eventmanagementapi.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

// Tells Jackson converter to put "resourceId" at first
// for others natural ordering as defined will be used
@JsonPropertyOrder("resourceId")
@Entity
public class Organizer extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;

    public Long getResourceId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Organizer) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
