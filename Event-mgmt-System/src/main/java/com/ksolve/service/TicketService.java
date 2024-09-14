package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Ticket;

public interface TicketService {
	Ticket saveTicket(Ticket ticket);

	Optional<Ticket> getTicketById(Long id);

	List<Ticket> getAllTickets();

	void deleteTicket(Long id);
	// Additional custom methods as needed
}
