package assignment3.mediator;

public class LightSensor implements Sensor {
    private int light;

    public LightSensor(int light) {
        this.light = light;
    }

    public int getInfo(){
        return light;
    }
}
