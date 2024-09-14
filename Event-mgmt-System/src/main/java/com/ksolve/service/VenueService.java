package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Venue;

public interface VenueService {
	Venue saveVenue(Venue venue);

	Optional<Venue> getVenueById(Long id);

	List<Venue> getAllVenues();

	void deleteVenue(Long id);
	// Additional custom methods as needed
}
