
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {
            System.out.println(String.format("First: %d/100", firstContainer));
            System.out.println(String.format("Second: %d/100", secondContainer));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            Integer liquidAmount = Integer.parseInt(splitInput[1]);
            
            if(liquidAmount < 0) {
                continue;
            }
            
            switch(command) {
                case "add":
                    if(firstContainer + liquidAmount < 100) {
                        firstContainer += liquidAmount;
                    } else {
                        firstContainer = 100;
                    }
                break;
                case "move":
                    int liquidToMove = liquidAmount;
                    if(firstContainer - liquidAmount < 0) {
                        liquidToMove = firstContainer;
                    }
                    firstContainer -= liquidToMove;
                    if(secondContainer + liquidToMove < 100) {
                        secondContainer += liquidToMove;
                    } else {
                        secondContainer = 100;
                    }
                    
                break;
                case "remove":
                    if(secondContainer - liquidAmount < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= liquidAmount;
                    }
                break;
            }

        }
    }

}
