package assignment3.mediator;

public class TemperatureSensor implements Sensor {
    private int temperature;

    public TemperatureSensor(int temperature) {
        this.temperature = temperature;
    }

    public int getInfo(){
        return temperature;
    }
}
