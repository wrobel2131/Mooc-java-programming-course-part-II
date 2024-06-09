/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class CD implements Packable {
    private String artist;
    private String name;
    private int publicationYear;
    private final double weight;
    
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s (%d)", this.artist, this.name, this.publicationYear);
    }
    
}
