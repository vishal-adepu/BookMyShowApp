package com.management.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "theatre")
public class Theatre extends BaseModel{

    private String name;
    private String address;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "theatre")
    private List<Hall> halls = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "theatre")
    private List<Show> shows = new ArrayList<>();

}
