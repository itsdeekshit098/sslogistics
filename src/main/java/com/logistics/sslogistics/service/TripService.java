package com.logistics.sslogistics.service;

import com.logistics.sslogistics.model.Trip;
import com.logistics.sslogistics.repository.TripRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public Flux<Trip> getTripsByBus(String busNo) {
        return tripRepository.findByBusNo(busNo);
    }

    public Flux<Trip> getTripsByBusAndDateRange(String busNo, String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        return tripRepository.findByBusNoAndDateBetween(busNo, start, end);
    }
}
