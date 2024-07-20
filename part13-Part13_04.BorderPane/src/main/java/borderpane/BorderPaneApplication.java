package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Border pane exercise");
        Label northDirection = new Label("NORTH");
        Label southDirection = new Label("SOUTH");
        Label eastDirection = new Label("EAST");
        
        BorderPane pane = new BorderPane();
        pane.setTop(northDirection);
        pane.setBottom(southDirection);
        pane.setRight(eastDirection);
        
        Scene scene = new Scene(pane, 600, 600);
        window.setScene(scene);
        window.show();
    }

}
