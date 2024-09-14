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

import com.ksolve.entity.Venue;
import com.ksolve.service.VenueService;

@RestController
@RequestMapping("/venues")
public class VenueController {

	@Autowired
	private VenueService venueService;

	@PostMapping
	public ResponseEntity<Venue> createVenue(@RequestBody Venue venue) {
		Venue createdVenue = venueService.saveVenue(venue);
		return ResponseEntity.ok(createdVenue);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Venue> getVenueById(@PathVariable Long id) {
		Optional<Venue> venue = venueService.getVenueById(id);
		return venue.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<Venue>> getAllVenues() {
		List<Venue> venues = venueService.getAllVenues();
		return ResponseEntity.ok(venues);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteVenue(@PathVariable Long id) {
		venueService.deleteVenue(id);
		return ResponseEntity.noContent().build();
	}
}
