package bike;

public class Bike {
    private boolean isOn;
    private int bikeGear = 0;
    private int speed =0;

    public boolean isOn() {
        return isOn;
    }
    public int getBikeGear() {
        return bikeGear;
    }
    public int getSpeed() {
        return speed;
    }

    public void turnOn(boolean turnOn){
      isOn =turnOn;
    }

    public void increaseBikeGear() {
           if( bikeGear < 5) {
               bikeGear++;
           }
        }

    public void increaseSpeed() {
            if (bikeGear ==1 && speed <20){
                speed++;
    }
            if (bikeGear ==2 && speed < 30){
                speed++;
            }
        if (bikeGear ==3 && speed < 40){
            speed++;
        }
        if (bikeGear ==4 && speed < 50){
            speed++;
        }
    }

    public void decreaseGear() {
        bikeGear--;
    }

    public void decraeseSpeed() {
        if (bikeGear ==1 && speed > 0){
            speed--;
        }
        if (bikeGear ==2 && speed > 20){
            speed--;
        }
        if (bikeGear ==3 && speed > 30){
            speed--;
        }
        if (bikeGear ==4 && speed > 40){
            speed--;
        }
    }
}
