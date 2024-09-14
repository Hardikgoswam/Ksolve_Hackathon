package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	// Custom query methods (if needed) can be defined here
}
