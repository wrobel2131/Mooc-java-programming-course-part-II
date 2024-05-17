
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class UserInterface {
    private final TodoList todoList;
    private final Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        loop:
        while(true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            switch(command) {
                case "add":
                    this.handleAddCommand();
                break;
                case "list":
                    this.handleListCommand();
                break;
                case "remove":
                    this.handleRemoveCommand();
                break;
                case "stop":
                    break loop;
  
            }
        }
    }
    
    public void handleAddCommand() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }
    
    public void handleListCommand() {
        this.todoList.print();
    }
    
    public void handleRemoveCommand() {
        System.out.println("Which one is removed:");
        try {
            int indexOfTask = Integer.parseInt(this.scanner.nextLine());
            this.todoList.remove(indexOfTask);
        } catch(NumberFormatException ex) {
            System.out.println("Wrong format of index");
        }
    }
}
