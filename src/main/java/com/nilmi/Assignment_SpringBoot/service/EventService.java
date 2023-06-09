package com.nilmi.Assignment_SpringBoot.service;

import com.nilmi.Assignment_SpringBoot.entity.Event;
import com.nilmi.Assignment_SpringBoot.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public Event get(Long eventId) {
        Optional<Event> optionalEvent = eventRepository.findById(eventId);

        if (optionalEvent.isEmpty()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }

        return optionalEvent.get();
    }

    public ResponseEntity<String> save(Event event) {
        eventRepository.save(event);
        return new ResponseEntity<>("Event created", HttpStatus.CREATED);
    }

    public ResponseEntity<String> update(Long eventId, Event event) {
        Optional<Event> optionalEvent = eventRepository.findById(eventId);

        if (optionalEvent.isEmpty()) {
            return new ResponseEntity<>("Event cannot be found to update", HttpStatus.NOT_FOUND);
        }

        var newEvent = event;
        newEvent.setEventId(eventId);

        eventRepository.save(newEvent);

        return new ResponseEntity<>("Event updated", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<String> delete(Long eventId) {
        Optional<Event> optionalEvent = eventRepository.findById(eventId);

        if (optionalEvent.isEmpty()) {
            return new ResponseEntity<>("Event cannot be found to delete", HttpStatus.NOT_FOUND);
        }

        eventRepository.deleteById(eventId);

        return new ResponseEntity<>("Event deleted", HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<String> saveEventBatch(List<Event> eventList) {
        eventRepository.saveAll(eventList);

        return new ResponseEntity<>("Saved", HttpStatus.CREATED);
    }

}
