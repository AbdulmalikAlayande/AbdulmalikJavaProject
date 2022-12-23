package tdd;

public class AirConditioner {
    private boolean isOn;
    private boolean isOff;
    private int temperature;

    public void setOn(boolean switchOn) {
        this.isOn = switchOn;
    }
    public boolean isOn(){

        return isOn;
    }
    public void setOff (boolean switchOff){
      this.isOff = switchOff;
    }

    public boolean isOff(){

        return isOff;
    }

    public void increaseTemperature(int degrees){
       if (degrees > 16) temperature += 1;
       if (degrees <= 30) temperature += degrees;
       if (degrees > 30) temperature = 30;
    }
    public void decreaseTemperature(int degrees){
        if (degrees < 16) temperature = 16;
        if(degrees > 16 && degrees <= 30) temperature = degrees - 1;
        if (degrees > 30) temperature = 30;
    }
    public int getTemperature() {
        return temperature;
    }



}
