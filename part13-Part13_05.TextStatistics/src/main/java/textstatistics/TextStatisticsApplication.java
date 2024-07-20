package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        window.setTitle("Text Statistics exercise");
        BorderPane layout = new BorderPane();
        
        TextArea textField = new TextArea();
        
        Label lettersText = new Label("Letters: 0");
        Label wordsText = new Label("Words: 0");
        Label longestWordText = new Label("The longest word is:");
        
        HBox textGroup = new HBox();
        textGroup.getChildren().addAll(lettersText, wordsText, longestWordText);
        
        layout.setCenter(textField);
        layout.setBottom(textGroup);
        
        Scene view = new Scene(layout, 500, 500);
        
        window.setScene(view);
        window.show();
    }

}
