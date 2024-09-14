package com.ksolve.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	private String description;

	@Column(nullable = false)
	private String startDate;

	@Column(nullable = false)
	private String endDate;

	private String location;

	private Integer capacity;

	private String status; // e.g., SCHEDULED, CANCELLED

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "venue_id")
	private Venue venue;

	@OneToMany(mappedBy = "event")
	private Set<Attendee> attendees;

	@OneToMany(mappedBy = "event")
	private Set<Notifications> notifications;

	// Getters and Setters
}
