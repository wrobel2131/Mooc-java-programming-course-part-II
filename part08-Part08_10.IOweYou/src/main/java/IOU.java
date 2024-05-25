
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class IOU {
    
    private HashMap<String, Double> receivables;
    
    public IOU() {
        this.receivables = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.receivables.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.receivables.getOrDefault(toWhom, 0.0);
    }
}
