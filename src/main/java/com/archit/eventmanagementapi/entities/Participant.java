package com.archit.eventmanagementapi.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.util.Objects;

// Tells Jackson converter to put "resourceId" at first
// for others natural ordering as defined will be used
@JsonPropertyOrder("resourceId")
@Entity
public class Participant extends AbstractEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private boolean checkedIn;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;

    public Long getResourceId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Participant) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
