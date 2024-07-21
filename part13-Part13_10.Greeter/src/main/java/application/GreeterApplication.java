package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {
        Label instructionLabel = new Label("Enter your name and start.");
        TextField nameInput = new TextField();
        nameInput.setMaxWidth(200);
        Button startButton = new Button("Start");
        VBox formComponentsGroup = new VBox();
        formComponentsGroup.setSpacing(10);
        formComponentsGroup.setAlignment(Pos.CENTER);
        formComponentsGroup.setPadding(new Insets(20, 20, 20, 20));
        formComponentsGroup.getChildren().addAll(instructionLabel, nameInput, startButton);
        
        Scene formScene = new Scene(formComponentsGroup, 400, 400);
        
        Label greetingsLabel = new Label();
        BorderPane greetingsComponentsGroup = new BorderPane();
        greetingsComponentsGroup.setCenter(greetingsLabel);
        Scene greetingsScene = new Scene(greetingsComponentsGroup, 400, 400);
        
        startButton.setOnAction((event) -> {
            greetingsLabel.setText(String.format("Welcome %s!", nameInput.getText()));
            window.setScene(greetingsScene);
        });
        
        window.setScene(formScene);
        window.show();
        
        
        
    }
}
