
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: "+firstContainer);
            System.out.println("Second: "+secondContainer);

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
                    firstContainer.add(liquidAmount);
                break;
                case "move":
                    int transferedLiquid = liquidAmount;
                    if(firstContainer.contains() - liquidAmount < 0) {
                        transferedLiquid = firstContainer.contains();
                    }
                    firstContainer.remove(transferedLiquid);
                    secondContainer.add(transferedLiquid);
                    
                break;
                case "remove":
                    secondContainer.remove(liquidAmount);
                break;
            }

        }
    }

}
