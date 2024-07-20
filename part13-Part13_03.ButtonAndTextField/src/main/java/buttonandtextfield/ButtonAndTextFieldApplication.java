package buttonandtextfield;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button button = new Button("Button");
        TextField textField = new TextField();
        
        GridPane pane = new GridPane();
        pane.add(textField, 0, 0);
        pane.add(button, 0, 1);
        GridPane.setHalignment(textField, HPos.CENTER);
        GridPane.setValignment(textField, VPos.CENTER);
        GridPane.setHalignment(button, HPos.CENTER);
        GridPane.setValignment(button, VPos.CENTER);

        // Center the GridPane within its container
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10); // Horizontal gap between columns
        pane.setVgap(10); // Vertical gap between rows

        
        Scene scene = new Scene(pane, 1000, 600);
        window.setScene(scene);
        window.show();
    }
    
}
