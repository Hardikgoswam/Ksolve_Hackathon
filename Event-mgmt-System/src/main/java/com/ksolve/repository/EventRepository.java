package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	// Custom query methods (if needed) can be defined here
}
