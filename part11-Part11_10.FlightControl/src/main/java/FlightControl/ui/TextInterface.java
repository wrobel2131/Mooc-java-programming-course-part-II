/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.logic.FlightService;
import java.util.Scanner;

/**
 *
 * @author other21
 */
public class TextInterface implements UserInterface{
    
    private final Scanner scanner;
    private final FlightService flightService;
    
    public TextInterface(Scanner scanner, FlightService flightService) {
        this.scanner = scanner;
        this.flightService = flightService;
    } 
    
    @Override
    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }
    
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while(true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String input = this.scanner.nextLine();
            if(input.toLowerCase().equals("x")) {
                break;
            }
            
            try {
                switch(Integer.parseInt(input)) {
                    case 1:
                        addAirplane();
                    break;
                    case 2:
                        addFlight();
                    break;
                        
                }
            } catch(NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    private void addAirplane() {
        System.out.println("Give the airplane id:");
        String airplaneId = this.scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        
        int capacity;
        try {
            capacity = Integer.parseInt(this.scanner.nextLine());
        } catch(NumberFormatException ex) {
            System.out.println(ex);
            return;
        }
        this.flightService.addAirplane(airplaneId, capacity);
    }

    private void addFlight() {
        System.out.println("Give the airplane id:");
        String airplaneId = this.scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String departureId = this.scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String targetId = this.scanner.nextLine();
        this.flightService.addFlight(airplaneId, departureId, targetId);
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        
        while(true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String input = this.scanner.nextLine();
            if(input.toLowerCase().equals("x")) {
                break;
            }
            
            try {
                switch(Integer.parseInt(input)) {
                    case 1:
                        printAirplanes();
                    break;
                    case 2:
                        printFlights();
                    break;
                    case 3:
                        printAirplaneDetails();
                    break;
                }
            } catch(NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
  
    private void printAirplanes() {
        this.flightService
                .getAirplanes()
                .forEach(a -> System.out.println(a));
    }

    private void printFlights() {
        this.flightService
                .getFlights()
                .forEach(f -> System.out.println(f));
    }

    private void printAirplaneDetails() {
        System.out.println("Give the airplane id:");
        String airplaneId = this.scanner.nextLine();
        System.out.println(this.flightService.getAirplane(airplaneId));
    }

      
}
