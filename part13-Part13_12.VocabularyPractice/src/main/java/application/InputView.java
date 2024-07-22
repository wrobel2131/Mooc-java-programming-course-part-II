/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author other21
 */
public class InputView {
    private final Dictionary dictionary;
    
    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);
        
        Label wordLabel = new Label("Word");
        TextField wordText = new TextField();
        
        Label translationLabel = new Label("Translation");
        TextField translationText = new TextField();
        Button addTranslationButton = new Button("Add translation");

        
        layout.add(wordLabel, 0, 0);
        layout.add(wordText, 0, 1);
        layout.add(translationLabel, 0, 2);
        layout.add(translationText, 0, 3);
        layout.add(addTranslationButton, 0, 4);
        
        addTranslationButton.setOnMouseClicked((e) -> {
            this.dictionary.add(wordText.getText(), translationText.getText());
            wordText.clear();
            translationText.clear();
        });
        
        return layout;
    }
    
    
}
