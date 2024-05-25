
import java.util.ArrayList;
import java.util.HashMap;
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> unitStorage = this.storage.get(unit);
        unitStorage.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if(this.storage.containsKey(storageUnit)) {
            ArrayList<String> storageOfUnit = this.storage.get(storageUnit);
            storageOfUnit.remove(item);
            if(storageOfUnit.isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        return this.storage
                .entrySet()
                .stream()
                .filter(e -> !e.getValue().isEmpty())
                .map(e -> e.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
