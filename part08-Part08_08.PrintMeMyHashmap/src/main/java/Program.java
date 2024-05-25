
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
    }
    
    public static void printKeys(HashMap<String,String> hashmap) {
        hashmap
                .keySet()
                .stream()
                .forEach(k -> System.out.println(k));
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        hashmap
                .keySet()
                .stream()
                .filter(k -> k.contains(text))
                .forEach(k -> System.out.println(k));

    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        hashmap
                .entrySet()
                .stream()
                .filter(e -> e.getKey().contains(text))
                .map(e -> e.getValue())
                .forEach(v -> System.out.println(v));
                
    }
    

}
