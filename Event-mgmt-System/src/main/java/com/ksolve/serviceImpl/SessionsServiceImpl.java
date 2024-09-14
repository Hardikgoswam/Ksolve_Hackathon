package com.ksolve.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolve.entity.Sessions;
import com.ksolve.repository.SessionRepository;
import com.ksolve.service.SessionsService;

@Service
public class SessionsServiceImpl implements SessionsService {

	@Autowired
	private SessionRepository  sessionsRepository;

	@Override
	public Sessions saveSession(Sessions session) {
		return sessionsRepository.save(session);
	}

	@Override
	public Optional<Sessions> getSessionById(Long id) {
		return sessionsRepository.findById(id);
	}

	@Override
	public List<Sessions> getAllSessions() {
		return sessionsRepository.findAll();
	}

	@Override
	public void deleteSession(Long id) {
		sessionsRepository.deleteById(id);
	}
}
