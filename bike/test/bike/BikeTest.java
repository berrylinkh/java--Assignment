package bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void createBike (){
         bike = new Bike();
    }
    @Test
    public void bikeIsOn(){
        bike.turnOn (true);
        assertTrue(bike.isOn());
    }
    @Test
    public void bikeIsOff(){
        bike.turnOn (true);
        assertTrue(bike.isOn());
        bike.turnOn (false);
        assertFalse(bike.isOn());
    }
    @Test
    public void testThatbikeGearIncreaseByOne() {
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        assertEquals(1, bike.getBikeGear());
    }
    @Test
    public void testThatbikeGearIsOnOneSpeedIncreaseFrom1To20(){
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        assertEquals(1, bike.getBikeGear());
        for(int speedControl = 0; speedControl <20; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());
    }
    @Test
    public void testThatbikeGearIsOnTwoSpeedIncreaseFrom21To30(){
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        assertEquals(2, bike.getBikeGear());
        for(int speedControl = 20; speedControl <30; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(10, bike.getSpeed());
    }
    @Test
    public void testThatbikeGearIsOnThreeSpeedIncreaseFrom31To40(){
        bike.turnOn(true);
        assertTrue(bike.isOn());

        bike.increaseBikeGear();
        bike.increaseBikeGear();
        bike.increaseBikeGear();

        assertEquals(3, bike.getBikeGear());
        for(int speedControl = 30; speedControl <40; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(10, bike.getSpeed());
    }

    @Test
    public void testThatbikeGearIsOnThreeSpeedIncreaseFrom41AndAbove(){
        bike.turnOn(true);
        assertTrue(bike.isOn());

        bike.increaseBikeGear();
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        bike.increaseBikeGear();

        assertEquals(4, bike.getBikeGear());
        for(int speedControl = 40; speedControl < 50; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(10, bike.getSpeed());
    }
    @Test
    public void testThatbikeGeardecelerateByOne() {
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        assertEquals(1, bike.getBikeGear());
        bike.decreaseGear();
        assertEquals(0, bike.getBikeGear());
    }
    @Test
    public void testThatBikeSpeedCanDecelerateToZeroAtGearOne() {
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        assertEquals(1, bike.getBikeGear());
        for(int speedControl = 0; speedControl < 20; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());
        for (int speedCountrol = 20; speedCountrol > 0; speedCountrol --){
            bike.decraeseSpeed();
        }
        assertEquals(0, bike.getSpeed());
    }
    @Test
    public void testThatBikeSpeedDecelerateAtGearTwo() {
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        assertEquals(2, bike.getBikeGear());
        for(int speedControl = 0; speedControl < 30; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(30, bike.getSpeed());
        for (int speedCountrol = 30; speedCountrol > 20; speedCountrol --){
            bike.decraeseSpeed();
        }
        assertEquals(20, bike.getSpeed());
    }
    @Test
    public void testThatBikeSpeedDecelerateAtGearThree() {
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        assertEquals(3, bike.getBikeGear());
        for(int speedControl = 0; speedControl < 40; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(40, bike.getSpeed());
        for (int speedCountrol = 40; speedCountrol > 30; speedCountrol --){
            bike.decraeseSpeed();
        }
        assertEquals(30, bike.getSpeed());
    }
    @Test
    public void testThatBikeSpeedDecelerateAtGearFour() {
        bike.turnOn(true);
        assertTrue(bike.isOn());
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        bike.increaseBikeGear();
        assertEquals(4, bike.getBikeGear());
        for(int speedControl = 0; speedControl < 50; speedControl ++){
            bike.increaseSpeed();
        }
        assertEquals(50, bike.getSpeed());
        for (int speedCountrol = 50; speedCountrol > 40; speedCountrol --){
            bike.decraeseSpeed();
        }
        assertEquals(40, bike.getSpeed());
    }
}
