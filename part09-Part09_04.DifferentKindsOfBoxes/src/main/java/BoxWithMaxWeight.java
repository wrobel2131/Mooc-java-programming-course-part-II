
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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    

    @Override
    public void add(Item item) {
        if(item.getWeight() > this.capacityLeft()) {
            return;
        }
        this.items.add(item);
    }

    
    private int sumWeightOfItems() {
        return this.items
                .stream()
                .map(Item::getWeight)
                .mapToInt(Integer::intValue)
                .sum();
    }
    
    private int capacityLeft() {
        return this.capacity - this.sumWeightOfItems();
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
