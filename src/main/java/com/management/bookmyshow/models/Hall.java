package com.management.bookmyshow.models;

import com.management.bookmyshow.enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "hall")
public class Hall extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    private String name;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "hall")
    private List<Seat> seats = new ArrayList<>();

    @OneToMany
    private List<Show> shows = new ArrayList<>();

    //@Enumerated(EnumType.STRING)  ->This will store the enum values as string
    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();
}
