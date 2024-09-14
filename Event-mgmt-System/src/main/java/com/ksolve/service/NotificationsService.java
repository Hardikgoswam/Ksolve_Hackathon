package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Notifications;

public interface NotificationsService {
	Notifications saveNotification(Notifications notification);

	Optional<Notifications> getNotificationById(Long id);

	List<Notifications> getAllNotifications();

	void deleteNotification(Long id);
	// Additional custom methods as needed
}
