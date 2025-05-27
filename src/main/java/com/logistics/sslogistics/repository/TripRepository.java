package com.logistics.sslogistics.repository;

import com.logistics.sslogistics.model.Trip;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import java.time.LocalDate;


@Repository
public interface TripRepository extends ReactiveCrudRepository<Trip, Long> {
    Flux<Trip> findByBusNo(String busNo);
    Flux<Trip> findByBusNoAndDateBetween(String busNo, LocalDate startDate, LocalDate endDate);
}
