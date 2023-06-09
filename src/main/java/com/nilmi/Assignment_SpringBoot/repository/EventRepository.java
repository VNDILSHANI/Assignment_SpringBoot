package com.nilmi.Assignment_SpringBoot.repository;

import com.nilmi.Assignment_SpringBoot.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
