
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int numberOfPrints = -1;
        Random random = new Random();
        while(numberOfPrints < 0) {
            try {
                numberOfPrints = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            
            if(numberOfPrints < 0) {
                continue;
            }
            
            for (int i = 0; i < numberOfPrints; i++) {
                System.out.println(random.nextInt(11));
            }
        }
        
        
        
        
        
    }

}
