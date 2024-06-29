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
public class Hideout<T> {
    
    private T hidden;
    
    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        hidden = toHide;
    }
    
    public T takeFromHideout() {
        T hiddenToTake = hidden;
        hidden = null;
        return hiddenToTake;
    }
    
    public boolean isInHideout() {
        return hidden != null;
    }
    
}
