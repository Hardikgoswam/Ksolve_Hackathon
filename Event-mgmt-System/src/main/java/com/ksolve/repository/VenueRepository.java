package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
	// Custom query methods (if needed) can be defined here
}
