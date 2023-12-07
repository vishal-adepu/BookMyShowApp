package com.management.bookmyshow.models;

import com.management.bookmyshow.enums.SeatType;
import jakarta.persistence.*;
import org.springframework.jmx.export.annotation.ManagedAttribute;

@Entity
@Table(name = "seat")
public class Seat extends BaseModel{

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    private Integer number;

    //@Enumerated(EnumType.STRING)  ->This will store the enum values as string
    @Enumerated
    private SeatType type;


}
