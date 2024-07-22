package ticTacToe;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    private boolean isGameFinished = false;


    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Tic Tac Toe game");
        TicTacToeBoard gameBoard = new TicTacToeBoard();
        
        BorderPane mainLayout = new BorderPane();
        mainLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Label turnLabel = new Label(String.format("Turn: %s", gameBoard.turn()));
        turnLabel.setFont(Font.font("Monospaced", 40));
        
        GridPane buttonsLayout = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = createButton(i, j);
                final int row = i;
                final int col = j;
                btn.setOnMouseClicked((e) -> {
                    if(this.isGameFinished) {
                        return;
                    }
                    if(gameBoard.pressBoardButton(row, col, gameBoard.turn())) {
                        btn.setText(gameBoard.getPlayerAtSpecificButton(row, col).toString());
                        if(gameBoard.hasPlayerWon(gameBoard.turn())) {
//                           turnLabel.setText(String.format("Player %s won", gameBoard.turn()));
                            turnLabel.setText("The end!");
                           this.isGameFinished = true;
                           return;
                        }
                        gameBoard.setAnotherPlayerTurn();
                        turnLabel.setText(String.format("Turn: %s", gameBoard.turn()));

                    }
                });
                buttonsLayout.add(btn, j, i);
            }
        }
        
        buttonsLayout.setPadding(new Insets(10, 10, 10, 10));
        buttonsLayout.setAlignment(Pos.CENTER);
        buttonsLayout.setHgap(10);
        buttonsLayout.setVgap(10);
        
        mainLayout.setTop(turnLabel);
        mainLayout.setCenter(buttonsLayout);
        
        
        Scene scene = new Scene(mainLayout, 400, 400);
        window.setScene(scene);
        window.show();
        
    }
    
    private Button createButton(int x, int y) {
         Button btn = new Button(" ");
         btn.setFont(Font.font("Monospaced", 40));
         return btn;
    }

}
