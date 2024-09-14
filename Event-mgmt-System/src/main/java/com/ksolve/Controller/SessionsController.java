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

import com.ksolve.entity.Sessions;
import com.ksolve.service.SessionsService;

@RestController
@RequestMapping("/sessions")
public class SessionsController {

	@Autowired
	private SessionsService sessionsService;

	@PostMapping
	public ResponseEntity<Sessions> createSession(@RequestBody Sessions session) {
		Sessions createdSession = sessionsService.saveSession(session);
		return ResponseEntity.ok(createdSession);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Sessions> getSessionById(@PathVariable Long id) {
		Optional<Sessions> session = sessionsService.getSessionById(id);
		return session.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<Sessions>> getAllSessions() {
		List<Sessions> sessions = sessionsService.getAllSessions();
		return ResponseEntity.ok(sessions);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteSession(@PathVariable Long id) {
		sessionsService.deleteSession(id);
		return ResponseEntity.noContent().build();
	}
}