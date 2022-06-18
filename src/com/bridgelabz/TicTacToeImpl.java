package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeImpl {
    public static char[] index = new char[10];
    public static void toeBoard() {
        for (int i = 0; i < index.length; i++) {
            index[i] = ' ';
        }
    }
    public static void showBoard() {
        System.out.println(index[1] + " " + "|" + " " + index[2] + " " + "|" + " " + index[3]);
        System.out.println(index[4] + " " + "|" + " " + index[5] + " " + "|" + " " + index[6]);
        System.out.println(index[7] + " " + "|" + " " + index[8] + " " + "|" + " " + index[9]);

    }
    public static char user(Scanner scanner) {
        System.out.println("Enter your choice X or O only");
        return scanner.next().toUpperCase().charAt(0);
    }



}
