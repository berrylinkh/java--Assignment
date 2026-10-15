package com.lastma.data.repository;

import com.lastma.data.models.Driver;

import java.util.List;

public interface DriverRepository {

    Driver save(Driver driver);

    long count();

    List<Driver> findById(int id);

    List<Driver> findAll();

    boolean existsById(int id);

    void deleteById(List<Driver> driverToDelete);

    void deleteAll(List<Driver> driverToDelete);
}
