package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Joke application");
        String joke = "What do you call a bear with no teeth?";
        String answer = "A gummy bear.";
        String explanation = "Explanation not needed";
        
        BorderPane mainLayout = new BorderPane();
        
        HBox menuGroup = new HBox();
        menuGroup.setSpacing(10);
        menuGroup.setPadding(new Insets(15, 15, 15, 15));
        menuGroup.setAlignment(Pos.CENTER);
        Button showJokeButton = new Button("Joke");
        Button showAnswerButton = new Button("Answer");
        Button showExplanationButton = new Button("Explanation");
        menuGroup.getChildren().addAll(showJokeButton, showAnswerButton, showExplanationButton);
        mainLayout.setTop(menuGroup);
        StackPane jokeLayout = createContentLayout(joke);
        StackPane answerLayout = createContentLayout(answer);
        StackPane explanationLayout = createContentLayout(explanation);
        
        showJokeButton.setOnAction((e) -> {
            mainLayout.setCenter(jokeLayout);
        });
        
        showAnswerButton.setOnAction((e) -> {
            mainLayout.setCenter(answerLayout);
        });
        
        showExplanationButton.setOnAction((e) -> {
            mainLayout.setCenter(explanationLayout);
        });
        mainLayout.setCenter(jokeLayout);
        
        Scene mainScene = new Scene(mainLayout);
        
        window.setScene(mainScene);
        window.show();
        
        
        

        
        
        
    }
    
    private static StackPane createContentLayout(String content) {
        StackPane contentLayout = new StackPane();
        Label contentText = new Label(content);
        contentLayout.setPadding(new Insets(20, 20, 20, 20));
        contentLayout.setPrefSize(200, 200);
        contentLayout.setAlignment(Pos.CENTER);
        contentLayout.getChildren().add(contentText);
        return contentLayout;
        
    }
}
