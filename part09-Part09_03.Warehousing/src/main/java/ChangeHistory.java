
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
public class ChangeHistory {
    private final ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        if(this.history.isEmpty()) {
            return 0.0;
        }
        return this.history
                .stream()
                .max(Double::compare)
                .get();
    }
    
    public double minValue() {
        if(this.history.isEmpty()) {
            return 0.0;
        }
        return this.history
                .stream()
                .min(Double::compare)
                .get();
    }
    
    public double average() {
        if(this.history.isEmpty()) {
            return 0.0;
        }
        return this.historySum() / this.history.size();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
    private double historySum() {
        return this.history
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}
