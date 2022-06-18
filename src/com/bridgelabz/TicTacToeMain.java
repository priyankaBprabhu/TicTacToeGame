package com.bridgelabz;
import static com.bridgelabz.TicTacToeImpl.scanner;

public class TicTacToeMain {
    public static char userTurn;
    public static char computerTurn;
    public static int chance;
    public static void main(String[] args) {
        System.out.println("tic tac toe game");
        TicTacToeImpl.toeBoard();
        chance = (int) (Math.random() * 10 % 2) ;
        if(chance == 0) {
            userTurn = TicTacToeImpl.user(scanner);
            TicTacToeImpl.moveLocation(userTurn);
        }
        else {
            computerTurn = (userTurn == 'X')? 'O' :  'X';
            TicTacToeImpl.comLocation(computerTurn);
        }
        TicTacToeImpl.showBoard();
    }
}
