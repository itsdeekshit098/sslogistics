package com.logistics.sslogistics.repository;

import com.logistics.sslogistics.model.Bus;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends ReactiveCrudRepository<Bus, Long> {
}
