/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Book {
    private final String title;
    private final int recommendedAge;
    
    public Book(String title, int age) {
        this.title = title;
        this.recommendedAge = age;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getRecommendedAge() {
        return this.recommendedAge;
    }
    
    @Override
    public String toString() {
        return String.format("%s (recommended for %d year-olds or older", 
                this.title, this.recommendedAge);
    }
}
