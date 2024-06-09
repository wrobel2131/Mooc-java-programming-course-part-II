
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
public class ShoppingCart {
    private final Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
            return;
        }
        this.cart.put(product, new Item(product, 1, price));
    }
    
    public int price() {
        return this.cart
                .values()
                .stream()
                .mapToInt(Item::price)
                .sum();
    }
    
    public void print() {
        this.cart
                .values()
                .forEach(i -> System.out.println(i));
    }
}
