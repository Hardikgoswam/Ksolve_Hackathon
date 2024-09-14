package com.ksolve.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolve.entity.Attendee;
import com.ksolve.repository.AttendeeRepository;
import com.ksolve.service.AttendeeService;

@Service
public class AttendeeServiceImpl implements AttendeeService {

	@Autowired
	private AttendeeRepository attendeeRepository;

	@Override
	public Attendee saveAttendee(Attendee attendee) {
		return attendeeRepository.save(attendee);
	}

	@Override
	public Optional<Attendee> getAttendeeById(Long id) {
		return attendeeRepository.findById(id);
	}

	@Override
	public List<Attendee> getAllAttendees() {
		return attendeeRepository.findAll();
	}

	@Override
	public void deleteAttendee(Long id) {
		attendeeRepository.deleteById(id);
	}
}
