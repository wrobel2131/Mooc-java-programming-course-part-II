/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author other21
 */
public class FlightService {
    private final Map<String, Airplane> airplanes;
    private final Map<String, Flight> flights;
    private final Map<String, Place> places;
    
    public FlightService() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String airplaneId, int capacity) {
        this.airplanes.putIfAbsent(airplaneId, new Airplane(airplaneId, capacity));
    }
    
    public void addFlight(String airplaneId, String departureId, String targetId) {
        this.places.putIfAbsent(targetId, new Place(targetId));
        this.places.putIfAbsent(departureId, new Place(departureId));
        
        if(!this.airplanes.containsKey(airplaneId)) {
            System.out.println("Provided airplane does not exist!");
            return;
        }
        Flight flight = new Flight(
                this.airplanes.get(airplaneId), 
                this.places.get(departureId), 
                this.places.get(targetId));
        
        this.flights.put(flight.getId(), flight);
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id) {
        return this.airplanes.getOrDefault(id, null);
    }
}
