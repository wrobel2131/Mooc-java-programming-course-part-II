/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public abstract class Animal {
    private final String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(String.format("%s eats", this.name));
    }
    
    public void sleep() {
        System.out.println(String.format("%s sleeps", this.name));

    }
    
    public String getName() {
        return this.name;
    }
}
