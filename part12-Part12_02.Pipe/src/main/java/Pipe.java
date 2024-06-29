
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 * @param <T>
 */
public class Pipe<T> {
    private final Queue<T> pipe;
    
    public Pipe() {
        this.pipe = new LinkedList<>();
    }
    
    public void putInPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        return pipe.poll();
    }
    
    public boolean isInPipe() {
        return !pipe.isEmpty();
    }
    
}
