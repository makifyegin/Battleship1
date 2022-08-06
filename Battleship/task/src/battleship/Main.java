package battleship;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        String[][] field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "~";
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print((field[i][j]) + " ");
            }
            System.out.println();

        }
    }
}
