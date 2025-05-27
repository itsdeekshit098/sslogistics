package com.logistics.sslogistics.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("trips")
public class Trip {
    @Id
    private Long id;

    @Column("bus_no")
    private String busNo;

    @Column("starting_km")
    private String startingKm;

    @Column("ending_km")
    private String endingKm;

    @Column("date")
    private LocalDate date;

    public Trip() {}

    public Trip(Long id, String busNo, String startingKm, String endingKm, LocalDate date) {
        this.id = id;
        this.busNo = busNo;
        this.startingKm = startingKm;
        this.endingKm = endingKm;
        this.date = date;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBusNo() { return busNo; }
    public void setBusNo(String busNo) { this.busNo = busNo; }

    public String getStartingKm() { return startingKm; }
    public void setStartingKm(String startingKm) { this.startingKm = startingKm; }

    public String getEndingKm() { return endingKm; }
    public void setEndingKm(String endingKm) { this.endingKm = endingKm; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
