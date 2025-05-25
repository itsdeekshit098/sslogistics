package com.logistics.sslogistics.repository;

import com.logistics.sslogistics.model.Trip;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends ReactiveCrudRepository<Trip, Long> {
}
