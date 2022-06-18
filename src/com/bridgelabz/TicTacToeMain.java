package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeMain {
    public static char userTurn;
    public static char computerTurn;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("tic tac toe game");
        TicTacToeImpl ticTacToe = new TicTacToeImpl();
        ticTacToe.toeBoard();
        ticTacToe.showBoard();
        userTurn = ticTacToe.user(scanner);
        computerTurn =  ((userTurn == 'X') ? 'O' : 'X');

    }
}
