package com.lastma.data.repository;

import com.lastma.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository {
    private List<Driver> drivers = new ArrayList<>();
    private int numbersOfDrivers = 0;

    private void validateDriver(Driver driver) {
    if (driver == null) {
    throw new IllegalArgumentException("driver can not be null");
        }
    }

    private void validateId(int id) {
    if (id <= 0) {
    throw new IllegalArgumentException("driver can not be zero");
        }
    }

    @Override
    public Driver save(Driver driver) {
    validateDriver(driver);
    if (driver.getId() == 0) {
    driver.setId(++numbersOfDrivers);
    drivers.add(driver);
    }
    return driver;
    }

    @Override
    public long count() {
        return drivers.size();
    }

    @Override
    public List<Driver> findById(int id) {
    validateId(id);
    for (Driver driver : drivers) {
    if (driver.getId() == id) {
    return List.of(driver);
    }
    }
    return List.of();
    }

    @Override
    public List<Driver> findAll() {
    List<Driver> copy = new ArrayList<>(drivers);
    return copy;
    }

    @Override
    public boolean existsById(int id) {
    validateId(id);
    for(Driver driver: drivers){
    if (driver.getId() == id){
    return true;
    }
    }
    return false;
    }

    @Override
    public void deleteById(List<Driver> driverToDelete) {
    if (driverToDelete == null) {
    throw new IllegalArgumentException("Driver can not be null");
    }
    for (Driver driver : driverToDelete) {
    validateDriver(driver);
    validateId(driver.getId());
    for (Driver toDelete : drivers) {
    if (toDelete.getId() == driver.getId()) {
    drivers.remove(toDelete);
    break;
    }
    }
    }
    }

    @Override
    public void deleteAll(List<Driver> driverToDelete) {
    if (driverToDelete == null) {
    throw new IllegalArgumentException("Driver can not be null");
    }
    for (Driver driver : driverToDelete) {
    validateDriver(driver);
    drivers.remove(driver);
        }
    }
}
