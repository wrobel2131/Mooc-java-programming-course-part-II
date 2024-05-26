/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Teacher extends Person {
    private int salaryInEuro;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salaryInEuro = salary;
    }
    
    
    @Override
    public String toString() {
        return String.format("%s\n  salary %d euro/month", super.toString(), this.salaryInEuro);
    }
}
