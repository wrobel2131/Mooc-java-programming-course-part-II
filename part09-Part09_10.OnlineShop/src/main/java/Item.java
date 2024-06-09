/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Item {
    private final String product;
    private int quantity;
    private final int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.quantity * this.unitPrice;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %d", this.product, this.quantity);
    }
}
