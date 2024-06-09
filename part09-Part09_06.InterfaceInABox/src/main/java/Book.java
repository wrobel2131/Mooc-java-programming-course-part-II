/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Book implements Packable {
    private String authorName;
    private String name;
    private double weight;
    
    public Book(String author, String name, double weight) {
        this.authorName = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s", this.authorName, this.name);
    }
    
}
