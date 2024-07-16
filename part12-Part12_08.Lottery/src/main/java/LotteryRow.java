
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        Random random = new Random();
        this.numbers = new ArrayList<>();
        int AMOUNT_OF_DRAWN_NUMBERS = 7;
        int UPPER_BOUND = 40;
        int LOWER_BOUND = 1;
        for (int i = 0; i < AMOUNT_OF_DRAWN_NUMBERS;) {
            int randomValueFromRange = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
            if(containsNumber(randomValueFromRange)) {
                continue;
            }
            numbers.add(randomValueFromRange);
            i++;
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return numbers.contains(number);
    }
}

