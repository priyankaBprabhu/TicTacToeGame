package com.bridgelabz;

public class TicTacToeMain {
    public static void main(String[] args) {
        System.out.println("tic tac toe game");
        TicTacToeImpl game = new TicTacToeImpl();
        game.gameArray();
        game.showBoard();

    }
}
