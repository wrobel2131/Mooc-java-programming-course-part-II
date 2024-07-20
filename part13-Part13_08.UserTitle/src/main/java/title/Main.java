package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserTitle userTitle = new UserTitle(scanner);
        String title = userTitle.returnUserTitle();
        
        Application.launch(UserInterface.class, String.format("--title=%s", title));

    }

}
