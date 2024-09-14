package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Attendee;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
	// Custom query methods (if needed) can be defined here
}
