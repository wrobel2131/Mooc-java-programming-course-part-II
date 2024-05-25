
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashmap) {
        hashmap
                .values()
                .forEach(book -> System.out.println(book));
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        hashmap
                .values()
                .stream()
                .filter(book -> book
                        .getName()
                        .contains(text))
                .forEach(book -> System.out.println(book));
    }

}
