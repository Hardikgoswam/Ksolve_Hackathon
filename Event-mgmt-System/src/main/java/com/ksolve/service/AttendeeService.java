package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Attendee;

public interface AttendeeService {
	Attendee saveAttendee(Attendee attendee);

	Optional<Attendee> getAttendeeById(Long id);

	List<Attendee> getAllAttendees();

	void deleteAttendee(Long id);
	// Additional custom methods as needed
}
