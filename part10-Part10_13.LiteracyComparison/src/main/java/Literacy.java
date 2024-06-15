
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Literacy {
    private final String country;
    private final Gender gender;
    private final double literacyPercent;
    private final int year;
    
    public Literacy(String country, Gender gender, double literacyPercent, int year) {
        this.country = country;
        this.gender = gender;
        this.literacyPercent = literacyPercent;
        this.year = year;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public Gender getGender() {
        return this.gender;
    }
    
    public double getLiteracyPercent() {
        return this.literacyPercent;
    }
    
    public int getYear() {
        return this.year;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender.getGender() + ", " + this.literacyPercent;
    }
}
