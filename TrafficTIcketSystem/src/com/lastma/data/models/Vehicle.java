package com.lastma.data.models;

import java.time.Year;

public class Vehicle {

    private int id;
    private String brand;
    private String model;
    private Year year;
    private VehicleTypes types;

    public int getId() {
        return id;
    }

    public Vehicle setId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public VehicleTypes getTypes() {
        return types;
    }

    public void setTypes(VehicleTypes types) {
        this.types = types;
    }
}


