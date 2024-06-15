
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class BooksStorage {
    private final List<Book> books;
    
    public BooksStorage() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        if(book != null) {
            this.books.add(book);
        }
    }
    
    public int booksCount() {
        return this.books.size();
    }
    
    public void displayAllBooks() {         
        this.books
                .stream()
                .sorted(Comparator
                        .comparing(Book::getRecommendedAge)
                        .thenComparing(Book::getTitle))
                .forEach(b -> System.out.println(b));
    }
}
