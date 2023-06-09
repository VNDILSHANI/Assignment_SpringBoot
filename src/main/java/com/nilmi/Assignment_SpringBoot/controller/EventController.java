package com.nilmi.Assignment_SpringBoot.controller;

import com.nilmi.Assignment_SpringBoot.dto.BatchDto;
import com.nilmi.Assignment_SpringBoot.dto.RecordDto;
import com.nilmi.Assignment_SpringBoot.entity.Event;
import com.nilmi.Assignment_SpringBoot.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("")
    public List<Event> getAll() {
        return eventService.getAll();
    }

    @GetMapping("/{id}")
    public Event get(@PathVariable Long id) {
        return eventService.get(id);
    }

    @PostMapping("")
    public ResponseEntity<String> save(@RequestBody Event event) {
        return eventService.save(event);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Event event) {
        return eventService.update(id, event);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return eventService.delete(id);
    }

    @PostMapping("/batch")
    public ResponseEntity<String> saveFromEventBatch(@RequestBody BatchDto batchDto) {

        var recordList = batchDto.getRecordDtoList();

        var eventList = recordList.parallelStream()
                .flatMap(record -> record.getEvent().stream().map(eventData -> {
                    Event event = new Event();
                    event.setTransId(record.getTransId());
                    event.setTransTms(record.getTransTms());
                    event.setRcNum(record.getRcNum());
                    event.setClientId(record.getClientId());
                    event.setEventCnt(eventData.getEventCnt());
                    event.setLocationCd(eventData.getLocationCd());
                    event.setLocationId1(eventData.getLocationId1());
                    event.setLocationId2(eventData.getLocationId2());
                    event.setAddressNbr(eventData.getAddrNbr());
                    return event;
                }))
                .collect(Collectors.toList());

        return eventService.saveEventBatch(eventList);

    }
}