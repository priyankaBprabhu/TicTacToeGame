package com.bridgelabz;
import static com.bridgelabz.TicTacToeImpl.scanner;

public class TicTacToeMain {
    public static char userTurn;
    public static char computerTurn;
    public static void main(String[] args) {
        System.out.println("tic tac toe game");
        TicTacToeImpl.toeBoard();
        TicTacToeImpl.showBoard();
        userTurn = TicTacToeImpl.user(scanner);
        computerTurn =  ((userTurn == 'X') ? 'O' : 'X');
        TicTacToeImpl.moveLocation(userTurn);
        TicTacToeImpl.showBoard();

    }
}
