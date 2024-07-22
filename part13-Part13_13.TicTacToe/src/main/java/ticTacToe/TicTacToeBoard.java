/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author other21
 */
public class TicTacToeBoard {
    private final int ROWS = 3;
    private final int COLS = 3;
    private final Map<BoardButton, Player> buttons;
    private Player playerTurn;
    
    public TicTacToeBoard() {
        this.buttons = new HashMap<>();
        this.playerTurn = Player.X;
        initializeBoardButtons(this.buttons);
    }
    
    public boolean hasPlayerWon(Player playerTurn) {
        boolean rows = checkRowsIfWon(playerTurn);
        boolean cols = checkColsIfWon(playerTurn);
        boolean diags = checkDiagsIfWon(playerTurn);
        return  rows || cols || diags;
    }
    
    
    
    
    public boolean pressBoardButton(int x, int y, Player playerTurn) {
        return updateButtonPlayer(x, y, playerTurn);
    } 
    
    
    public Player turn() {
        return this.playerTurn;
    }
    
    public void setAnotherPlayerTurn() {
        this.playerTurn = getOppositePlayer(this.playerTurn);

    }
    
    public Player getPlayerAtSpecificButton(int x, int y) {
        return this.buttons.get(new BoardButton(x, y));
    }
    
    private boolean checkRowsIfWon(Player playerTurn) {
        for (int i = 0; i < ROWS; i++) {
            List<Player> rowOfPlayers = new ArrayList<>();
            for (int j = 0; j < COLS; j++) {
                rowOfPlayers.add(getPlayerAtSpecificButton(i, j));
            }
            if(checkListOfPlayersIfWon(rowOfPlayers, playerTurn)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean checkColsIfWon(Player playerTurn) {
        List[] cols = new List[COLS];
        for (int i = 0; i < COLS; i++) {
            cols[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                cols[j].add(getPlayerAtSpecificButton(i, j));
            }
        }
        for (int i = 0; i < COLS; i++) {
            if(checkListOfPlayersIfWon(cols[i], playerTurn)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean checkDiagsIfWon(Player playerTurn) {
        List[] diags = new List[2];
        for (int i = 0; i < 2; i++) {
            diags[i] = new ArrayList<>();
        }
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if(i == j) {
                    diags[0].add(getPlayerAtSpecificButton(i, j));
                }
                if((i+j)%ROWS == ROWS-1) {
                    diags[1].add(getPlayerAtSpecificButton(i, j));
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            if(checkListOfPlayersIfWon(diags[i], playerTurn)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean checkListOfPlayersIfWon(List<Player> players, Player playerTurn) {
        return players.stream().allMatch(p -> p.equals(playerTurn));
    }
    
    private Player getOppositePlayer(Player player) {
        if(player.equals(Player.X)) {
            return Player.O;
        }
        if(player.equals(Player.O)) {
            return Player.X;
        }
        throw new IllegalArgumentException("Opposite player cannot be NONE");
    }
    
    private boolean isButtonFree(int x, int y) {
        BoardButton button = new BoardButton(x,y);
        if(!this.buttons.containsKey(button)) {
            throw new IllegalArgumentException("Button does not exists on board!");
        }
        return this.buttons.get(button).equals(Player.NONE);
    }  
    
    public boolean updateButtonPlayer(int x, int y, Player player) {
        if(!isButtonFree(x, y)) {
            return false;
        }
        buttons.put(new BoardButton(x, y), player);
        return true;
    }
    
    private void initializeBoardButtons(Map<BoardButton, Player> boardButtons) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                boardButtons.put(new BoardButton(i, j), Player.NONE);
            }
        }
    }
}
