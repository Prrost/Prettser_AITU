package assignment3.mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors;

    public HomeMediatorImpl() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void printReport(){
        for(Sensor sensor : sensors){
            System.out.println(sensor.getInfo());
        }
    }
}
