
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Warehouse {
    
    private final Map<String, Integer> productPrices;
    private final Map<String, Integer> productStocks;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }
    
    public Set<String> products() {
        return this.productPrices.keySet();
    }
    
    public int stock(String product) {
        return this.productStocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if(!this.productStocks.containsKey(product) || 
                this.productStocks.get(product).equals(0)) {
            return false;
        }
        this.productStocks.put(product, this.productStocks.get(product)-1);
        return true;
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStocks.put(product, stock);
    }
    
    public int price(String product) {
        return this.productPrices.getOrDefault(product, -99);
    }
}
