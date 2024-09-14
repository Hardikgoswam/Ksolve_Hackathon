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

import com.ksolve.entity.Notifications;
import com.ksolve.service.NotificationsService;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {

	@Autowired
	private NotificationsService notificationsService;

	@PostMapping
	public ResponseEntity<Notifications> createNotification(@RequestBody Notifications notification) {
		Notifications createdNotification = notificationsService.saveNotification(notification);
		return ResponseEntity.ok(createdNotification);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Notifications> getNotificationById(@PathVariable Long id) {
		Optional<Notifications> notification = notificationsService.getNotificationById(id);
		return notification.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<Notifications>> getAllNotifications() {
		List<Notifications> notifications = notificationsService.getAllNotifications();
		return ResponseEntity.ok(notifications);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteNotification(@PathVariable Long id) {
		notificationsService.deleteNotification(id);
		return ResponseEntity.noContent().build();
	}
}
