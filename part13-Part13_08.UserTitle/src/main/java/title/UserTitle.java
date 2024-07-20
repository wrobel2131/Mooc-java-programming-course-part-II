package title;

import java.util.Scanner;


public class UserTitle {
    private final Scanner scanner;
    
    public UserTitle(Scanner scanner) {
        this.scanner = scanner;
    }
    
    
    public String returnUserTitle() {
        while(true) {
            System.out.println("Enter the title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                continue;
            }
            
            return title;
        }
    }

}
