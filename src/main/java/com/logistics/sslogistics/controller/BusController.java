package com.logistics.sslogistics.controller;

import com.logistics.sslogistics.model.Bus;
import com.logistics.sslogistics.service.BusService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/v1")
public class BusController {

    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/buses")
    public Flux<Bus> getBuses() {
        return busService.getAllBuses();
    }
}
