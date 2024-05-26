
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
public class ProductWarehouse extends Warehouse{
    private String productName;
    
    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.productName = name;
    }
    
    public String getName() {
        return this.productName;
    }
    
    public void setName(String newName) {
        this.productName = newName;
    }
    
    
    @Override
    public String toString() {
        return String.format("%s: %s", this.productName, super.toString());
    }
}
