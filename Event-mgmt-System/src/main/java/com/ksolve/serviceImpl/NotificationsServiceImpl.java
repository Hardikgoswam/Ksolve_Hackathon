package com.ksolve.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolve.entity.Notifications;
import com.ksolve.repository.NotificationRepository;
import com.ksolve.service.NotificationsService;

@Service
public class NotificationsServiceImpl implements NotificationsService {

	@Autowired
	private NotificationRepository notificationsRepository;

	@Override
	public Notifications saveNotification(Notifications notification) {
		return notificationsRepository.save(notification);
	}

	@Override
	public Optional<Notifications> getNotificationById(Long id) {
		return notificationsRepository.findById(id);
	}

	@Override
	public List<Notifications> getAllNotifications() {
		return notificationsRepository.findAll();
	}

	@Override
	public void deleteNotification(Long id) {
		notificationsRepository.deleteById(id);
	}
}
