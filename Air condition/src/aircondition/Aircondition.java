package aircondition;


public class Aircondition {
    private boolean isOn;
    private int acTemperature = 0;

    public boolean isOn() {
        return isOn;
    }
    public int getAcTemperature() {
        return acTemperature;
    }

    public void isOn (boolean turnOn) {
        isOn=turnOn;
    }

    public void increaseAcTemperature() {
        if(acTemperature < 30) {
                acTemperature++;
        }
    }

    public void decreaseAcTemperature() {
        if(acTemperature >16){
            acTemperature--;
        }
    }
}
