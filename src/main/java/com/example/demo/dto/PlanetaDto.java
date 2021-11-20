package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PlanetaDto {
    private String name;
    @JsonProperty("rotation_period")
    private int rotationPeriod;
    @JsonProperty("orbital_period")
    private int orbitalPeriod;
    private int diameter;
    private String climate;
    private String gravity;
    private String terrain;
    @JsonProperty("surface_water")
    private int surfaceWater;
    private int population;
    private List<String> residents;
    private List<String> films;
    private String created;
    private String edited;
    private String url;


}
