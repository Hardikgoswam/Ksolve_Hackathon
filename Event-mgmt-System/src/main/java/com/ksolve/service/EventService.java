package com.ksolve.service;

import java.util.List;
import java.util.Optional;

import com.ksolve.entity.Event;

public interface EventService {
    Event saveEvent(Event event);
    Optional<Event> getEventById(Long id);
    List<Event> getAllEvents();
    void deleteEvent(Long id);
    // Additional custom methods as needed
}

