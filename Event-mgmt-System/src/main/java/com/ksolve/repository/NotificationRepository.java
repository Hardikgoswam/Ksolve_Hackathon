package com.ksolve.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksolve.entity.Notifications;

@Repository
public interface NotificationRepository extends JpaRepository<Notifications, Long> {
	// Custom query methods (if needed) can be defined here
}
