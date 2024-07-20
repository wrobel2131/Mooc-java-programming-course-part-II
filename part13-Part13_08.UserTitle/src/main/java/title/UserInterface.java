/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author other21
 */
public class UserInterface extends Application {

    @Override
    public void start(Stage window)  {
        window.setTitle("User title");
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        Label providedTitleLabel = new Label(String.format("Title provided by user: %s", title));
        BorderPane pane = new BorderPane();
        pane.setCenter(providedTitleLabel);
        
        Scene view = new Scene(pane, 400, 400);
        
        window.setScene(view);
        window.show();
    }
    
}
