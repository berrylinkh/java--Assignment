package com.lastma.data.repository;

import com.lastma.data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {
    private Vehicle Vehicle;
    private VehicleRepositoryImpl VehicleRepository;

    @BeforeEach
    public void Vehicle() {
        VehicleRepository = new VehicleRepositoryImpl();
        Vehicle = new Vehicle();
    }

    @Test
    void testThatWhenISaveCountIncreaseByOne() {
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        assertEquals(1L, VehicleRepository.count());
    }

    @Test
    void testThatSavesMultipleVehicles() {
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        Vehicle secondVehicle = VehicleRepository.save(new Vehicle());
        Vehicle thirdVehicle = VehicleRepository.save(new Vehicle());
        assertEquals(3L, VehicleRepository.count());
    }

    @Test
    void testThatSavesAVehicleAndGetsTheId() {
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        assertEquals(1, Vehicle.getId());
    }


    @Test
    void testThatThrowsExceptionForSavingNull() {
        assertThrows(IllegalArgumentException.class, () -> VehicleRepository.save(null));
    }

    @Test
    void testThatFindsAVehiclesById(){
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        assertEquals(1L, VehicleRepository.count());
        List<Vehicle> found = VehicleRepository.findById(1);
        for (Vehicle foundVehicle: found){
            assertEquals(1, foundVehicle.getId());
        }
    }

    @Test
    void testThatFindMultipleVehiclesById(){
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        Vehicle secondVehicle =  VehicleRepository.save(new Vehicle());
        Vehicle thirdVehicle =  VehicleRepository.save(new Vehicle());
        assertEquals(3L, VehicleRepository.count());
        List<Vehicle> found = VehicleRepository.findById(2);
        for (Vehicle foundVehicle: found){
            assertEquals(2, foundVehicle.getId());
        }
    }

    @Test
    void testThatFindAllVehiclesSaved(){
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        Vehicle secondVehicle =  VehicleRepository.save(new Vehicle());
        Vehicle thirdVehicle =  VehicleRepository.save(new Vehicle());
        List<Vehicle> all= VehicleRepository.findAll();
        assertEquals(3, all.size());
    }

    @Test
    void testThatExistVehiclesById(){
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        Vehicle secondVehicle =  VehicleRepository.save(new Vehicle());
        Vehicle thirdVehicle =  VehicleRepository.save(new Vehicle());
        assertEquals(3L, VehicleRepository.count());
        boolean exists = VehicleRepository.existsById(2);
        assertTrue(exists);
    }

    @Test
    void testThatDeleteVehiclesById(){
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        Vehicle secondVehicle =  VehicleRepository.save(new Vehicle());
        Vehicle thirdVehicle =  VehicleRepository.save(new Vehicle());
        VehicleRepository.deleteById(List.of(secondVehicle,thirdVehicle));
        assertEquals(1L, VehicleRepository.count());
    }

    @Test
    void testThatDeleteAll(){
        assertEquals(0L, VehicleRepository.count());
        VehicleRepository.save(Vehicle);
        Vehicle secondVehicle =  VehicleRepository.save(new Vehicle());
        Vehicle thirdVehicle =  VehicleRepository.save(new Vehicle());
        VehicleRepository.deleteAll(List.of(Vehicle,thirdVehicle));
        assertEquals(1L, VehicleRepository.count());
    }
}