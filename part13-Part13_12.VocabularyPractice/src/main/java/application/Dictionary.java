/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author other21
 */
public class Dictionary {
    private final Map<String, String> translations;
    
    public Dictionary() {
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        if(word.isEmpty() || translation.isEmpty()) {
            return;
        }
        this.translations.put(word, translation);
        
    }
    
    public String getTranslation(String word) {
        return this.translations.getOrDefault(word, null);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        
        return this.translations
                .keySet()
                .stream()
                .collect(Collectors
                        .collectingAndThen(Collectors
                                .toList(), 
                                list -> list.isEmpty() ? null : list.get(random.nextInt(list.size()))));
                
                      
    }
    
}
