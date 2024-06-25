/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author other21
 */
public class TemperatureSensor implements Sensor{
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if(!isOn) {
            throw new IllegalArgumentException("Sensor id currently off!");
        }
        return new Random().nextInt(61) - 30;
    }
    
}
