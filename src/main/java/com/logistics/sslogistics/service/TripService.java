package com.logistics.sslogistics.service;

import com.logistics.sslogistics.model.Trip;
import com.logistics.sslogistics.repository.TripRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Mono<Trip> createTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public Flux<Trip> getTrips(){
        return tripRepository.findAll();
    }
}
