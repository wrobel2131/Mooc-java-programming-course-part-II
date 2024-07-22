/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author other21
 */
public class PracticeView {
    private final Dictionary dictionary;
    private String randomWord;
    
    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.randomWord = dictionary.getRandomWord();
    }
    
    
    public Parent getView() {
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);
        Label wordToTranslateLabel;
        TextField userTranslation = new TextField();
        
        Button checkButton = new Button("Check");
        Label responseLabel = new Label("");
        if(randomWord == null) {
            wordToTranslateLabel = new Label(String.format("No words to practice on. Add some words and translations and come back later!"));
            checkButton.setDisable(true);
        } else {
            wordToTranslateLabel = new Label(String.format("Translate: %s", randomWord));
            layout.add(userTranslation, 0, 1);
        }
        
        
        
        
        layout.add(wordToTranslateLabel, 0, 0);
        layout.add(checkButton, 0, 2);
        layout.add(responseLabel, 0, 3);
        
        checkButton.setOnMouseClicked((e) -> {
            String correctTranslation = this.dictionary.getTranslation(randomWord);
            if(correctTranslation.toLowerCase().trim().equals(userTranslation.getText().toLowerCase().trim())) {
                responseLabel.setText("Correct!");
            } else {
                responseLabel.setText(String.format("Incorrect translation! Correct translation of word %s is %s", 
                        randomWord, correctTranslation));
                return;
            }
            
            randomWord = dictionary.getRandomWord();
            wordToTranslateLabel.setText(String.format("Translate: %s", randomWord));
            userTranslation.clear();
        });
        
        return layout;
    }
}
