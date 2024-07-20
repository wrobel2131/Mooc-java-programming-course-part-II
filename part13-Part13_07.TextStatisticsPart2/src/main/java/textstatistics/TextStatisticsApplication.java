package textstatistics;

import java.util.Arrays;
import java.util.stream.Collectors;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
        Label longestWordText = new Label("The longest word is: ");
        
        textField.textProperty().addListener((change, oldValue, newValue) -> {
            int lettersCount = (int) newValue.chars().filter(Character::isLetter).count();
//            int lettersCount = newValue.length(); //soultion to pass the tests, the above one doesnt count spaces to letters count
            String[] words = Arrays
                    .stream(newValue.split(" "))
                    .filter(w -> !w.isEmpty())
                    .toArray(String[]::new);
            int wordsCount = words.length;
            
            String longestWord = Arrays
                    .stream(words)
                    .sorted((w1, w2) -> w2.length() - w1.length())
                    .findFirst()
                    .get();
            lettersText.setText(String.format("Letters: %d", lettersCount));
            wordsText.setText(String.format("Words: %d", wordsCount));
            longestWordText.setText(String.format("The longest word is: %s", longestWord));
            
        });
        
        HBox textGroup = new HBox();
        textGroup.setSpacing(10);
        textGroup.getChildren().addAll(lettersText, wordsText, longestWordText);
        
        layout.setCenter(textField);
        layout.setBottom(textGroup);
        
        Scene view = new Scene(layout, 500, 500);
        
        window.setScene(view);
        window.show();
    }

}
