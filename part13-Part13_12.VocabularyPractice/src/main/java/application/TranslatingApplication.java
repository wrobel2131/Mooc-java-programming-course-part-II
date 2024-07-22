/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author other21
 */
public class TranslatingApplication extends Application {
    private final Dictionary dictionary;
    
    public TranslatingApplication() {
        this.dictionary = new Dictionary();
    }
    

    @Override
    public void start(Stage window) {
        window.setTitle("Translating app!");
        
        BorderPane mainLayout = new BorderPane();
        VBox menuLayout = new VBox();
        menuLayout.setAlignment(Pos.CENTER);
        menuLayout.setPadding(new Insets(10, 10, 10, 10));
        menuLayout.setSpacing(10);
        
        Button addTranslationsButton = new Button("Add new words");
        Button practiceButton = new Button("Practice");
        menuLayout.getChildren().addAll(addTranslationsButton, practiceButton);
        
        mainLayout.setLeft(menuLayout);
        
        InputView inputView = new InputView(this.dictionary);
        
        practiceButton.setOnAction((e) -> {
            mainLayout.setCenter(new PracticeView(this.dictionary).getView());
        });
        
        addTranslationsButton.setOnAction((e) -> {
            mainLayout.setCenter(inputView.getView());
        });
        
        mainLayout.setCenter(inputView.getView());
        Scene scene = new Scene(mainLayout, 700, 700);
        window.setScene(scene);
        window.show();
    }
    
}
