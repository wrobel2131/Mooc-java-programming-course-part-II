/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author other21
 */
public class SaveableDictionary {
    private final Map<String, String> dictionary;
    private String fileName;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.fileName = file;
    }
    
    public boolean save() {
        
        try(PrintWriter printWriter = new PrintWriter(fileName)) {
            dictionary
                .entrySet()
                .forEach(e -> {
                    printWriter.println(String.format("%s:%s", e.getKey(), e.getValue()));
                });
            
        } catch (FileNotFoundException ex) {
            return false;
        }
        
        
        return true;
    }
    
    public boolean load() {
        Scanner scanner;
        try {
            scanner = new Scanner(Paths.get(fileName));
        } catch (IOException ex) {
            return false;
        }
        while(scanner.hasNextLine()) {
            String[] splitLine = scanner.nextLine().split(":");
            dictionary.putIfAbsent(splitLine[0], splitLine[1]);
        }
        return true;
    }
    
    public void add(String words, String translation) {
        if(!(dictionary.containsKey(words) || dictionary.containsKey(translation) ||
                dictionary.containsValue(words) || dictionary.containsValue(translation))) {
            dictionary.put(words, translation);
        }
    }
    
    public String translate(String word) {
    if (dictionary.containsKey(word)) {
        return dictionary.get(word);
    }
    
    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
        if (entry.getValue().equals(word)) {
            return entry.getKey(); 
        }
    }
    
    return null;
                           
    }
    
    public void delete(String word) {
        if(word == null) {
            return;
        }
        
        if(dictionary.containsKey(word)){
            dictionary.remove(word);
            return;
        }
        
        Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(word)) {
                iterator.remove(); // Use iterator's remove method to safely remove from dictionary
            }
    }
    }
}
