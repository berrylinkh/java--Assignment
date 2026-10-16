package com.lastma.data.repository;

import com.lastma.data.models.Officer;
import com.lastma.data.models.Vehicle;

import java.util.List;

public interface VehicleRepository {

    Vehicle save (Vehicle vehicle);

    long count();

    List<Vehicle> findById(int id);

    List<Vehicle> findAll();

    boolean existsById(int id);

    void deleteAll(List<Vehicle> vehicleToDelete);

    void deleteById(List<Vehicle> vehicleToDelete);
}

