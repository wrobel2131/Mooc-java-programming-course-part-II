/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

import java.util.UUID;

/**
 *
 * @author other21
 */
public class Flight {
    private final String id;
    private final Airplane airplane;
    private final Place departure;
    private final Place target;
    
    public Flight(Airplane airplane, Place departure, Place target) {
        this.id = UUID.randomUUID().toString();
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }
    
    public String getId() {
        return this.id;
    }
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    public Place getDestination() {
        return this.departure;
    }
    
    public Place getTarget() {
        return this.target;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s-%s)", 
                this.airplane.toString(), this.departure.toString(), this.target.toString());
    }
}
