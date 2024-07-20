package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Notifier application");
        
        TextField textField = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(textField.getText());
        });
        
        VBox group = new VBox();
        group.setSpacing(20);
        group.getChildren().add(0, textField);
        group.getChildren().add(1, button);
        group.getChildren().add(2, label);
        
        Scene view = new Scene(group);
        window.setScene(view);
        window.show();
    }

}
