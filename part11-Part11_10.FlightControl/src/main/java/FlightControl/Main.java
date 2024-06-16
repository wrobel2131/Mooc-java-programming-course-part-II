package FlightControl;

import FlightControl.logic.FlightService;
import FlightControl.ui.TextInterface;
import FlightControl.ui.UserInterface;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        UserInterface ui = new TextInterface(new Scanner(System.in), new FlightService());
        ui.start();
    }
}
