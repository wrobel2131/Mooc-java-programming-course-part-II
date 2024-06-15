
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fileName = "literacy.csv";
        try {
        Files
                .lines(Paths.get(fileName))
                .map(l -> l.split(","))
                .map(l -> new Literacy(
                        l[3].trim(), 
                        Gender.fromString(l[2].trim().split(" ")[0]),
                        Double.parseDouble(l[5].trim()),
                        Integer.parseInt(l[4].trim())
                ))
                .sorted((l1, l2) -> Double.compare(l1.getLiteracyPercent(), l2.getLiteracyPercent()))
                .forEach(l -> System.out.println(l));
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
                
    }
}
