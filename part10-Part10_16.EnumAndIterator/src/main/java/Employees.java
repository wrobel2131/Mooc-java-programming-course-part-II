
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    private List<Person> people;
    
    public Employees() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        if(personToAdd != null) {
            this.people.add(personToAdd);
        }
    }
    
    public void add(List<Person> peopleToAdd) {
        if(peopleToAdd != null) {
            peopleToAdd.forEach(p -> this.add(p));
        }
    }
    
    public void print() {
        Iterator<Person> personIterator = this.people.iterator();
        while(personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> personIterator = this.people.iterator();
        while(personIterator.hasNext()) {
            Person nextPerson = personIterator.next();
            if(nextPerson.getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> personIterator = this.people.iterator();
        while(personIterator.hasNext()) {
            Person nextPerson = personIterator.next();
            if(nextPerson.getEducation().equals(education)) {
                personIterator.remove();
            }
        }
    }
}
