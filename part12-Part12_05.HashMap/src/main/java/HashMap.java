
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if(values[hashValue] == null) {
            return null;
        }
        
        List<Pair<K, V>> valueAtSpecifiedHashIndex = values[hashValue];
        for (int i = 0; i < valueAtSpecifiedHashIndex.size(); i++) {
            if(valueAtSpecifiedHashIndex.get(i).getKey().equals(key)) {
                return valueAtSpecifiedHashIndex.get(i).getValue();
            }
        }
        return null;
    }
    
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        if(1.0 * firstFreeIndex / values.length > 0.75) {
            grow();
        }

    }
    
    public V remove(K key) {
        List<Pair<K, V>> listOfPairsFromIndex = getListBasedOnKey(key);
        if(listOfPairsFromIndex.isEmpty()) {
            return null;
        }
        
        int index = getIndexOfKey(listOfPairsFromIndex, key);
        if(index < 0) {
            return null;
        }
        
        Pair<K, V> pair = listOfPairsFromIndex.get(index);
        listOfPairsFromIndex.remove(pair);
        return pair.getValue();
    }
    
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }
    
    private void copy(List<Pair<K, V>>[] newArray, int fromIndex) {
        for (int i = 0; i < values[fromIndex].size(); i++) {
            Pair<K,V> pair = values[fromIndex].get(i);
            int hashVal = Math.abs(pair.getKey().hashCode() % newArray.length);
            if(newArray[hashVal] == null) {
                newArray[hashVal] = new ArrayList<>();
            }
            
            newArray[hashVal].add(pair);
        }
    }
    
    private void grow() {
        List<Pair<K, V>>[] newArray = new List[values.length * 2];
        for (int i = 0; i < values.length; i++) {
            copy(newArray, i);
        }
        
        values = newArray;
    }
    
    
    
}
