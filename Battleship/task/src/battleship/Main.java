package battleship;

import java.util.Arrays;

public class Main {

Field fieldA = new Field();

    public static void main(String[] args) {
        // Write your code here
        String[][] field = new String[10][10];
        System.out.println();
        for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    field[i][j] = "~";

                }
            }
        System.out.println();

        for (int i = 0, l= 'A'; i < field.length; i++,l++) {
            System.out.print("" + Character.toString(l) + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print((field[i][j]) + " ");
            }
            System.out.println();

        }
    }
}
