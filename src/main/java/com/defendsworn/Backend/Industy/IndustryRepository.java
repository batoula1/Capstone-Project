package com.defendsworn.Backend.Industy;


import com.defendsworn.Backend.model.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryRepository extends JpaRepository<Industry, Long> {
    // You can define custom queries here if needed
}