package com.logistics.sslogistics.controller;

import com.logistics.sslogistics.model.Bus;
import com.logistics.sslogistics.model.Trip;
import com.logistics.sslogistics.service.BusService;
import com.logistics.sslogistics.service.TripService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*")
public class Controller {

    private final BusService busService;
    private final TripService tripService;

    public Controller(BusService busService, TripService tripService) {
        this.busService = busService;
        this.tripService = tripService;
    }

    @GetMapping("/buses")
    public Flux<Bus> getBuses() {
        return busService.getAllBuses();
    }

    @PostMapping("/trips")
    public Mono<Trip> createTrip(@RequestBody Trip trip) {
        return tripService.createTrip(trip);
    }

    @GetMapping("/trips")
    public Flux<Trip> getTrips(){
        return tripService.getTrips();
    }

//    @GetMapping("/trips/hansi")
//    public Flux<Trip> getTripsByBus(@PathVariable String busNo){
//        return tripService.getTripsByBus(busNo);
//    }

    @GetMapping("/trips/{busNo}")
    public Flux<Trip> getTripsByBusAndDateRange(
            @PathVariable String busNo,
            @RequestParam String startDate,
            @RequestParam String endDate) {

        return tripService.getTripsByBusAndDateRange(busNo, startDate, endDate);
    }


}
