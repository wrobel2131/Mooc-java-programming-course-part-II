
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class TodoList {
    private List<String> todos;
    
    public TodoList() {
        this.todos = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todos.add(task);
    }
    
    public void print() {
        IntStream
                .range(0, todos.size())
                .forEach(index -> System.out.println(String.format("%d: %s", index+1, todos.get(index))));
    }
    
    public void remove(int number) {
        if(number-1 >= 0 && number-1 < this.todos.size()) {
            this.todos.remove(number-1);
        }
    }
}
