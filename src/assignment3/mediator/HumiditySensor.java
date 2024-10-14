package assignment3.mediator;

public class HumiditySensor implements Sensor {
    private int humidity;

    public HumiditySensor(int humidity) {
        this.humidity = humidity;
    }
    public int getInfo() {
        return humidity;
    }
}
