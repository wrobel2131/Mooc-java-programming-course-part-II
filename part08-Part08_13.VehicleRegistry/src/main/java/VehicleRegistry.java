
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> register;
    
    public VehicleRegistry() {
        this.register = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(this.register.containsKey(licensePlate)) {
            if(!this.register.get(licensePlate).isEmpty()) {
                return false;
            }
        }
   
        this.register.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.register.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!this.register.containsKey(licensePlate)) {
            return false;
        }
        this.register.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        this.register
                .keySet()
                .forEach(plate -> System.out.println(plate));
    }
    
    public void printOwners() {
        this.register
                .values()
                .stream()
                .collect(Collectors.toSet())
                .forEach(owner -> System.out.println(owner));
    }
}
