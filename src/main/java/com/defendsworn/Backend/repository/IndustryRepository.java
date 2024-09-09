package com.defendsworn.Backend.repository;

import com.defendsworn.cybersecurity.model.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryRepository extends JpaRepository<Industry, Long> {
    // Custom query methods can be added here if necessary
}
