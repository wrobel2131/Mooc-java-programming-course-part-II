/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author other21
 */
public class AverageSensor implements Sensor {
    private final List<Sensor> sensors;
    private final List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        if(toAdd != null) {
            sensors.add(toAdd);
        }
    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        return areAllSensorsOn();
    }

    @Override
    public void setOn() {
        sensors
                .stream()
                .forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors
                .stream()
                .forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        int reading = (int)sensors
                .stream()
                .mapToInt(Sensor::read)
                .average()
                .getAsDouble();
        readings.add(reading);
        return reading;  
    }
    
    private boolean areAllSensorsOn() {
        return sensors
                .stream()
                .map(Sensor::isOn)
                .allMatch(Boolean::booleanValue);
    }
    
}
