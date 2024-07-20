package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Label and Button exercise");
        
        Button buttonComponent = new Button("Submit");
        Label labelComponent = new Label("Label");
        
        
        FlowPane group = new FlowPane();
        group.getChildren().addAll(labelComponent, buttonComponent);
        
        
        Scene scene = new Scene(group, 400, 400);
        window.setScene(scene);
        window.show();
    }

}
