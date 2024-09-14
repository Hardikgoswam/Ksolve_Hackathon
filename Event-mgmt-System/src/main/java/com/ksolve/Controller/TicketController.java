package com.ksolve.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksolve.entity.Ticket;
import com.ksolve.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping
	public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
		Ticket createdTicket = ticketService.saveTicket(ticket);
		return ResponseEntity.ok(createdTicket);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
		Optional<Ticket> ticket = ticketService.getTicketById(id);
		return ticket.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<Ticket>> getAllTickets() {
		List<Ticket> tickets = ticketService.getAllTickets();
		return ResponseEntity.ok(tickets);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTicket(@PathVariable Long id) {
		ticketService.deleteTicket(id);
		return ResponseEntity.noContent().build();
	}
}
