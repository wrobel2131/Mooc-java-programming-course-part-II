
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputs = new ArrayList<>();
        while(true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if(input < 0) {
                    break;
                }
            inputs.add(input);
            } catch(NumberFormatException ex) {
                System.out.println("It's not an integer!");
                break;
            }
            
        }
        
        inputs
                .stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(e -> System.out.println(e));
    }
}
