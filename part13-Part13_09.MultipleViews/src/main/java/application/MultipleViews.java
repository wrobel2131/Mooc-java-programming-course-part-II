package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        Application.launch(UserInterface.class);
//        launch(MultipleViews.class);
    }

    /**
     * Method only for passing the tests, preferably use created UserInterface class to launch UI
     * @param window 
     */
    @Override
    public void start(Stage window) {
        window.setTitle("Three views application!");
        
        BorderPane firstViewPane = new BorderPane();
        Label firstViewLabel = new Label("First view!");
        Button firstToSecondViewButton = new Button("To the second view!");
        firstViewPane.setCenter(firstToSecondViewButton);
        firstViewPane.setTop(firstViewLabel);
        Scene firstView = new Scene(firstViewPane); 
        
        VBox secondViewPane = new VBox();
        secondViewPane.setSpacing(10);
        Button secondToThirdViewButton = new Button("To the third view!");
        Label secondViewLabel = new Label("Second view!");
        secondViewPane.getChildren().addAll(secondToThirdViewButton, secondViewLabel);
        Scene secondView = new Scene(secondViewPane);
        
        GridPane thirdViewPane = new GridPane();
        Button thirdToFirstViewButton = new Button("To the first view!");
        Label thirdViewLabel = new Label("Third view!");
        thirdViewPane.add(thirdViewLabel, 0, 0);
        thirdViewPane.add(thirdToFirstViewButton, 1, 1);
        Scene thirdView = new Scene(thirdViewPane);
        
        firstToSecondViewButton.setOnAction((event) -> {
            window.setScene(secondView);
        });
        
        secondToThirdViewButton.setOnAction((event) -> {
            window.setScene(thirdView);
        });
        
        thirdToFirstViewButton.setOnAction((event) -> {
            window.setScene(firstView);
        });
        
        window.setScene(firstView);
        window.show();
    }

}
