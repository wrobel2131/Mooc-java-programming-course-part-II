
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksStorage booksStorage = new BooksStorage();
        UserInterface ui = new UserInterface(scanner, booksStorage);
        ui.readBooks();
    }

}
