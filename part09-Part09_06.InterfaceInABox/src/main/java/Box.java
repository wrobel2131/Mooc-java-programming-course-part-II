
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(this.spaceLeft() < item.weight()) {
            return;
        }
        this.items.add(item);
    }

    @Override
    public double weight() {
        return this.items
                .stream()
                .map(Packable::weight)
                .mapToDouble(Double::doubleValue)
                .sum();
    }
    
    private double spaceLeft() {
        return this.capacity - this.weight();
    }
    
    private int itemCount() {
        return this.items.size();
    }
    
    @Override
    public String toString() {
        return "Box: " + this.itemCount() + " items, total weight " + this.weight() +" kg";
    }
    
}
