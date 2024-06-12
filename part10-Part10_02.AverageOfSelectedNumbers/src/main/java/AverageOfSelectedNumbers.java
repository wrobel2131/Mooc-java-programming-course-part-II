
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> numbers = new ArrayList<>();
        while(true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        if(option.equals("n")) {
            System.out.println("Average of the negative numbers: %f" +
                    numbers
                            .stream()
                            .mapToInt(Integer::parseInt)
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble());
        } else if(option.equals("p")) {
            System.out.println("Average of the positive numbers: %f" + 
                    numbers
                            .stream()
                            .mapToInt(Integer::parseInt)
                            .filter(i -> i > 0)
                            .average()
                            .getAsDouble());
        }

    }
}
