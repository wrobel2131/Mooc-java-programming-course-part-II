
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
public class UserInterface {
    private final PositiveNumbersService positiveNumbersService;
    private final Scanner scanner;
    
    public UserInterface(Scanner scanner, PositiveNumbersService positiveNumbersService) {
        this.scanner = scanner;
        this.positiveNumbersService = positiveNumbersService;
    }
    
    public void averageOfPositiveNumbers() {
        while(true) {
            try {
                int num = Integer.parseInt(this.scanner.nextLine());
                if(num == 0) {
                    break;
                }
                this.positiveNumbersService.addPositiveNumber(num);
            } catch(NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
        this.printAverageOfPositiveNumbers();
        
    }
    
    private void printAverageOfPositiveNumbers() {
        if(this.positiveNumbersService.countOfPositiveNumbers() == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println(this.positiveNumbersService.calculateAverageOfPositiveNumbers());
    }
}
