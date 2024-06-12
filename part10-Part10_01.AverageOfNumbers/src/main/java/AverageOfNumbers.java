
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> numbers = new ArrayList<>();
        
        while(true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            numbers.add(input);
        }
        double average = numbers
                        .stream()
                        .mapToInt(Integer::parseInt)
                        .average()
                        .getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
}
