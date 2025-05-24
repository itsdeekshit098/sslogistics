package com.logistics.sslogistics.service;

import com.logistics.sslogistics.model.Bus;
import com.logistics.sslogistics.repository.BusRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BusService {
    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Flux<Bus> getAllBuses() {
        return busRepository.findAll()
                .doOnNext(bus -> System.out.println("Loaded bus: " + bus));
    }

}
