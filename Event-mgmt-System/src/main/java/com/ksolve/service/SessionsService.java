package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Sessions;

public interface SessionsService {
	Sessions saveSession(Sessions session);

	Optional<Sessions> getSessionById(Long id);

	List<Sessions> getAllSessions();

	void deleteSession(Long id);
	// Additional custom methods as needed
}
