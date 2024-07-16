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
public class List<T> {
    private T[] values;
    private int firstAvailableIndex;
    
    public List() {
        this.values = (T[]) new Object[10];
        this.firstAvailableIndex = 0;
    }
    
    public void add(T value) {
        if(firstAvailableIndex == values.length) {
            grow();
        }
        values[firstAvailableIndex] = value;
        firstAvailableIndex++;
    }
    
    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }
    
    public void remove(T value) {
        int index = indexOfValue(value);
         if(index < 0) {
             return;
         }
         
         moveValuesToLeft(index);
         firstAvailableIndex--;
    }
    
    
    public T value(int index) {
        if (index < 0 || index >= firstAvailableIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstAvailableIndex + "]");
        }

        return this.values[index];
    }
    
    private void moveValuesToLeft(int fromIndex) {
        for (int i = fromIndex; i < values.length-1; i++) {
            values[i] = values[i+1];
        }
    }
    
    private int indexOfValue(T value) {
        for (int i = 0; i < values.length; i++) {
            if(values[i].equals(value)) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int size() {
        return this.firstAvailableIndex;
    }
    
    private void grow() {
        int newSize = values.length + values.length/2;
        T[] newValues = (T[]) new Object[newSize];
        System.arraycopy(values, 0, newValues, 0, values.length);
        values = newValues;
    }
    
}
