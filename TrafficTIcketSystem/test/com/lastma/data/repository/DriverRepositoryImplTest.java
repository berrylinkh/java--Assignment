package com.lastma.data.repository;

import com.lastma.data.models.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DriverRepositoryImplTest {
    private Driver driver;
    private DriverRepositoryImpl driverRepository;

    @BeforeEach
    public void driver(){
    driverRepository = new DriverRepositoryImpl();
    driver = new Driver();
    }

    @Test
    void testThatWhenISave_CountIncreaseByOne(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    assertEquals(1L, driverRepository.count());
    }

    @Test
    void testThatSavesMultipleDrivers(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    Driver secondDriver =  driverRepository.save(new Driver());
    Driver thirdDriver =  driverRepository.save(new Driver());
    assertEquals(3L, driverRepository.count());
    }

    @Test
    void testThatSavesADriverAndGetsTheId(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    assertEquals(1, driver.getId());
    }

    @Test
    void testThatThrowsExceptionForSavingNull(){
    assertThrows(IllegalArgumentException.class,()-> driverRepository.save(null));
    }

    @Test
    void testThatFindsADriversById(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    assertEquals(1L, driverRepository.count());
    List<Driver> found = driverRepository.findById(1);
    assertEquals(1, found.get(0).getId());
    }

    @Test
    void testThatFindMultipleDriversById(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    Driver secondDriver =  driverRepository.save(new Driver());
    Driver thirdDriver =  driverRepository.save(new Driver());
    assertEquals(3L, driverRepository.count());
    List<Driver> found = driverRepository.findById(2);
    assertEquals(2, found.get(0).getId());
    }

    @Test
    void testThatFindAllDriversSaved(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    Driver secondDriver =  driverRepository.save(new Driver());
    Driver thirdDriver =  driverRepository.save(new Driver());
    List<Driver> all= driverRepository.findAll();
    assertEquals(3, all.size());
    }

    @Test
    void testThatExistDriversById(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    Driver secondDriver =  driverRepository.save(new Driver());
    Driver thirdDriver =  driverRepository.save(new Driver());
    assertEquals(3L, driverRepository.count());
    boolean exists = driverRepository.existsById(2);
    assertTrue(exists);
    }

    @Test
    void testThatDeleteDriversById(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    Driver secondDriver =  driverRepository.save(new Driver());
    Driver thirdDriver =  driverRepository.save(new Driver());
    driverRepository.deleteById(List.of(driver,thirdDriver));
    assertEquals(1L, driverRepository.count());
    }

    @Test
    void testThatDeleteAll(){
    assertEquals(0L, driverRepository.count());
    driverRepository.save(driver);
    Driver secondDriver =  driverRepository.save(new Driver());
    Driver thirdDriver =  driverRepository.save(new Driver());
    driverRepository.deleteAll(List.of(driver,thirdDriver));
    assertEquals(1L, driverRepository.count());
    }
}