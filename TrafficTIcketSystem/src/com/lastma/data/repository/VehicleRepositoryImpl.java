package com.lastma.data.repository;
import com.lastma.data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository{

    private List<Vehicle> Vehicles = new ArrayList<>();
    private int numberOfVehicles =0;

    private void validateVehicle(Vehicle Vehicle) {
        if (Vehicle == null) {
        throw new IllegalArgumentException("driver can not be null");
            }
    }

    private void validateVehicleId(int id) {
    if (id <= 0) {
    throw new IllegalArgumentException("driver can not be zero");
        }
    }

    @Override
    public Vehicle save(Vehicle Vehicle) {
    validateVehicle(Vehicle);
    if (Vehicle.getId() == 0){
    Vehicle.setId(++numberOfVehicles);
    Vehicles.add(Vehicle);
        }
    else {
    int index = Vehicles.indexOf(Vehicle);
    if (index != -1) {
    Vehicles.set(index, Vehicle);
            }
        }
        return Vehicle;
    }

    @Override
    public long count() {
    return Vehicles.size();
    }

    @Override
    public List<Vehicle> findById(int id) {
    validateVehicleId(id);
    for(Vehicle Vehicle: Vehicles){
    if(Vehicle.getId()==id){
    return List.of(Vehicle);
            }
        }
    return List.of();
    }

    @Override
    public List<Vehicle> findAll() {
    List<Vehicle> copy = new ArrayList<>(Vehicles);
    return copy;
    }

    @Override
    public boolean existsById(int id) {
    validateVehicleId(id);
    for (Vehicle Vehicle: Vehicles){
    if(Vehicle.getId()==id){
    return true;
            }
        }
    return false;
    }


    @Override
    public void deleteById(List<Vehicle> VehicleToDelete) {
    if (VehicleToDelete == null) {
    throw new IllegalArgumentException("Driver can not be null");
    }
    for (Vehicle Vehicle: VehicleToDelete) {
    validateVehicle(Vehicle);
    validateVehicleId(Vehicle.getId());
    for (Vehicle toDelete : Vehicles) {
    if (toDelete.getId() == Vehicle.getId()) {
    Vehicles.remove(toDelete);
    break;
            }
            }
        }
    }

    @Override
    public void deleteAll(List<Vehicle> VehicleToDelete) {
    if (VehicleToDelete == null) {
    throw new IllegalArgumentException("Driver can not be null");
    }
    for (Vehicle Vehicle: VehicleToDelete){
    validateVehicle(Vehicle);
    Vehicles.remove(Vehicle);
        }
    }
}
