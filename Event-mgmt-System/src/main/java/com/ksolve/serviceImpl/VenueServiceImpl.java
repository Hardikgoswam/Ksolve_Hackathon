package com.ksolve.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolve.entity.Venue;
import com.ksolve.repository.VenueRepository;
import com.ksolve.service.VenueService;

@Service
public class VenueServiceImpl implements VenueService {

	@Autowired
	private VenueRepository venueRepository;

	@Override
	public Venue saveVenue(Venue venue) {
		return venueRepository.save(venue);
	}

	@Override
	public Optional<Venue> getVenueById(Long id) {
		return venueRepository.findById(id);
	}

	@Override
	public List<Venue> getAllVenues() {
		return venueRepository.findAll();
	}

	@Override
	public void deleteVenue(Long id) {
		venueRepository.deleteById(id);
	}
}
