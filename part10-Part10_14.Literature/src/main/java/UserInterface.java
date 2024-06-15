
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
    private final Scanner scanner;
    private final BooksStorage booksStorage;
    
    public UserInterface(Scanner scanner, BooksStorage booksStorage) {
        this.scanner = scanner;
        this.booksStorage = booksStorage;
    }
    
    public void readBooks() {
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = this.scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int recommendedAge;
            try {
                recommendedAge = Integer.parseInt(this.scanner.nextLine());
            } catch(NumberFormatException ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            
            booksStorage.addBook(new Book(title, recommendedAge));
        }
        System.out.println(booksStorage.booksCount() + " books in total.");
        
        System.out.println("Books:");
        booksStorage.displayAllBooks();
        
    }
}
