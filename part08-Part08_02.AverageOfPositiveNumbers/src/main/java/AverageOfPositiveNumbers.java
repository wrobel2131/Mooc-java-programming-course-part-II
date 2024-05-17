
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNumbersService positiveNumbersService = new PositiveNumbersService();
        UserInterface userInterface = new UserInterface(scanner, positiveNumbersService);
        userInterface.averageOfPositiveNumbers();
    }
}
