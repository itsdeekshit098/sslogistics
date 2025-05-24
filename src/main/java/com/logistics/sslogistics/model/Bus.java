package com.logistics.sslogistics.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("buses")
public class Bus {
    @Id
    private Long id;

    @Column("bus_no")
    private String busNo;

    public Bus() {}

    public Bus(Long id, String busNo) {
        this.id = id;
        this.busNo = busNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
}

