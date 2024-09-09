package com.defendsworn.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity // This annotation marks the class as a JPA entity (a table in the database)
public class Industry {

    @Id // This annotation marks the field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This will auto-increment the ID
    private Long id;

    private String name;
    private String description;

    // Constructors
    public Industry() {}

    public Industry(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
