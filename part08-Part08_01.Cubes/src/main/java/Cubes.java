
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine(); 
            if(input.equals("end")) {
                break;
            }
            try {
                System.out.println(Cubes.calculateCube(Integer.parseInt(input)));
                
            } catch(NumberFormatException ex) {
                System.out.println(ex);
            }

        }
        

    }
    
    public static int calculateCube(int num) {
        return num*num*num;
    }
}
