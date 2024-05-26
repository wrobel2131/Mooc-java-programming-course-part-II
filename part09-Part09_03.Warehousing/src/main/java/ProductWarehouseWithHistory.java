/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private final ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(super.getBalance());
    }
    
    public String history() {
        return this.changeHistory.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double takenValue = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());
        return takenValue;
    }
    
    public void printAnalysis() {
        System.out.println(String.format("Product: %s", super.getName()));
        System.out.println(String.format("History: %s", this.changeHistory));
        System.out.println(String.format("Largest amount of product: %f", this.changeHistory.maxValue()));
        System.out.println(String.format("Smallest amount of product: %f", this.changeHistory.minValue()));
        System.out.println(String.format("Average: %f", this.changeHistory.average()));
    }
    
    
}
