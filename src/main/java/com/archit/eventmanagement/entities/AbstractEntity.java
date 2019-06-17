package com.archit.eventmanagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;

// NOTES: @MappedSuperclass
//  1. It lets hibernate know to not create table for this class
//  2. This is the super class of real entities
//  3. Usually, this class holds generic field like ID
@MappedSuperclass
public class AbstractEntity {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @JsonIgnore
    @CreationTimestamp
    // NOTES: @Column(updatable = false), @Column(insertable = false)
    //  1. Once created its instance, this property can not be updated in DB
    //  2. Similarly, @Column(insertable = false)
    @Column(updatable = false)
    protected Instant created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }
}
