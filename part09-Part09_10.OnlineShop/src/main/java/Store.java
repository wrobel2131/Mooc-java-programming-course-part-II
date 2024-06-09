
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Store {
    private final Warehouse warehouse;
    private final Scanner scanner;
    
    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println(String.format("Welcome to the store %s", customer));
        System.out.println("our selection: ");
        this.warehouse
                .products()
                .forEach(p -> System.out.println(p));
        
        while(true) {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = this.scanner.nextLine();
            if(product.isEmpty()) {
                break;
            }
            // Add code here that adds the product to the cart,
            // If there is any in the warehouse, and reduces the stock in the warehouse
            // Don't touch any of the other code!
            if(this.warehouse.take(product)) {
                cart.add(product, this.warehouse.price(product));
            }
            
        }
        
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
    
    
}
