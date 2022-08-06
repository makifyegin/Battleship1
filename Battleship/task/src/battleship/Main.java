package battleship;

import java.util.Arrays;

public class Main {

Field fieldA = new Field();

    public static void main(String[] args) {
        // Write your code here
        String[][] field = new String[10][10];  //Multidimensional Array[10][10] as a String
        for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    field[i][j] = "~";
                }
            }
        System.out.print("  ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0, l= 'A'; i < field.length; i++,l++) {
            System.out.print("" + Character.toString(l) + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print((field[i][j]) + " ");
            }
            System.out.println();

            // ~ denotes the fog of war
            // O denotes a cells with your ship
            // X denotes that the ship was hit?
        }
    }
}
