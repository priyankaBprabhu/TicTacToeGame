package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeImpl {
    public static int userPos;
    public static Scanner scanner = new Scanner(System.in);

    public static char[] gameArray = new char[10];

    public static void toeBoard() {
        Arrays.fill(gameArray, ' ');
    }

    public static char user(Scanner scanner) {
        System.out.println("Enter your choice X or O only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void showBoard() {
        System.out.println(gameArray[1] + " " + "|" + " " + gameArray[2] + " " + "|" + " " + gameArray[3]);
        System.out.println(gameArray[4] + " " + "|" + " " + gameArray[5] + " " + "|" + " " + gameArray[6]);
        System.out.println(gameArray[7] + " " + "|" + " " + gameArray[8] + " " + "|" + " " + gameArray[9]);

    }

    public static void moveLocation(char userTurn) {
        if (userTurn == 'X') {
            System.out.println("\n Select the position in a board from [1-9]");
            userPos = scanner.nextInt();

            switch (userPos) {
                case 1:
                    if (gameArray[1] == ' ') {
                        gameArray[1] = userTurn;
                    }
                    break;
                case 2:
                    if (gameArray[2] == ' ') {
                        gameArray[2] = userTurn;
                    }
                    break;
                case 3:
                    if (gameArray[3] == ' ') {
                        gameArray[3] = userTurn;
                    }
                    break;
                case 4:
                    if (gameArray[4] == ' ') {
                        gameArray[4] = userTurn;
                    }
                    break;
                case 5:
                    if (gameArray[5] == ' ') {
                        gameArray[5] = userTurn;
                    }
                    break;
                case 6:
                    if (gameArray[6] == ' ') {
                        gameArray[6] = userTurn;
                    }
                    break;
                case 7:
                    if (gameArray[7] == ' ') {
                        gameArray[7] = userTurn;
                    }
                    break;
                case 8:
                    if (gameArray[8] == ' ') {
                        gameArray[8] = userTurn;
                    }
                    break;
                case 9:
                    if (gameArray[9] == ' ') {
                        gameArray[9] = userTurn;
                    }
                    break;
                default:
                    System.out.println("invalid position ! restart game");
                    break;
            }
        }
    }
}
