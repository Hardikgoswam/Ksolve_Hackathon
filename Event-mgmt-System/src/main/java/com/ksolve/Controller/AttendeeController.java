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

import com.ksolve.entity.Attendee;
import com.ksolve.service.AttendeeService;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {

	@Autowired
	private AttendeeService attendeeService;

	@PostMapping
	public ResponseEntity<Attendee> createAttendee(@RequestBody Attendee attendee) {
		Attendee createdAttendee = attendeeService.saveAttendee(attendee);
		return ResponseEntity.ok(createdAttendee);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Attendee> getAttendeeById(@PathVariable Long id) {
		Optional<Attendee> attendee = attendeeService.getAttendeeById(id);
		return attendee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<Attendee>> getAllAttendees() {
		List<Attendee> attendees = attendeeService.getAllAttendees();
		return ResponseEntity.ok(attendees);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAttendee(@PathVariable Long id) {
		attendeeService.deleteAttendee(id);
		return ResponseEntity.noContent().build();
	}
}
