
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Herd implements Movable {
    private final List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        this.herd
                .forEach(m -> m.move(dx, dy));
    }
    
    @Override
    public String toString() {
        return this.herd
                .stream()
                .map(Movable::toString)
                .collect(Collectors.joining("\n"));
    }
}
