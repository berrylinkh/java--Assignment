package aircondition;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirconditionTest {

    @BeforeEach
    public void createAirCondition() {
        airCondition = new Aircondition();
    }

private Aircondition airCondition;
    @Test
    public void testThatIHaveAnAirCondition (){
        airCondition = new Aircondition();
    }

    @Test
    public void testThatWhenITurnOnAcIsOn () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
    }

    @Test
    public void testThatWhenITurnOffAcIsOff () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
        airCondition.isOn(false);
        assertFalse(airCondition.isOn());
    }
    @Test
    public void testThatWhenITurnOnAcAndIncreaseItIncreases () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
        airCondition.increaseAcTemperature();
        assertEquals(1, airCondition.getAcTemperature());
    }

    @Test
    public void testThatWhenITurnOnAc_IncreaseACAndDecreaseTemperatureReduces () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
        airCondition.increaseAcTemperature();
        assertEquals(1, airCondition.getAcTemperature());
        airCondition.decreaseAcTemperature();
        assertEquals(0, airCondition.getAcTemperature());
    }

    @Test
    public void testThatWhenITurnOnAcAndTemperatureMustNotExceed30 () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
        airCondition.increaseAcTemperature();
        assertEquals(30, airCondition.getAcTemperature());
    }
    @Test
    public void testThatWhenITurnOnAcAndTemperatureStartFrom16AndStopAt30 () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
        for (int control = 16; airCondition.getAcTemperature() < 30; control++) {
            airCondition.increaseAcTemperature();
        }
        assertEquals(30, airCondition.getAcTemperature());
    }

    @Test
    public void testThatWhenITurnAcOnAndDecreaseTemperatureIsNotLessThan16 () {
        airCondition.isOn(true);
        assertTrue(airCondition.isOn());
        for (int control = 30; airCondition.getAcTemperature() > 16; control--) {
            airCondition.decreaseAcTemperature();
        }
        assertEquals(16, airCondition.getAcTemperature());
    }
}
