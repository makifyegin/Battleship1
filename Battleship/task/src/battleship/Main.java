package battleship;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main extends Field {
    public static String firstColumnCharacter1;
    public static String secondColumnCharacter1;
    public static String firstColumnCharacter2;
    public static String secondColumnCharacter2;
    public static int secondColumnInteger1;
    public static int secondColumnInteger2;
    public static String firstColumn;
    public static String secondColumn;
    public static int dif;
    public static String[][] firstPlayerOcean = new String[10][10];

    public static void main(String[] args) {
        String shipName;
        Field secondPlayer = new Field();
        Field firstPlayer = new Field();

        String[][] secondPlayerOcean = new String[10][10];
        // Write your code here
        Scanner scanner = new Scanner(System.in);
//        while () {


//        int b7 = findCharactersSubtrack(firstColumnCharacter1, firstColumnCharacter2);

        printMultiDimensionalArray(firstPlayer.createOcean());
        System.out.println();
        for (ships value : ships.values()) {
            System.out.printf("Enter the coordinates of the %s (%d cells)\n", value.getNameOfShips(), value.getLengthOfShips().length);
            System.out.println();
            firstColumn = scanner.next();
            secondColumn = scanner.next();
            firstPlayerOcean = firstPlayer.createOcean();
            firstColumnCharacter1 = "" + firstColumn.charAt(0);
            secondColumnCharacter1 = "" + firstColumn.charAt(1);
            firstColumnCharacter2 = "" + secondColumn.charAt(0);
            secondColumnCharacter2 = "" + secondColumn.charAt(1);
            secondColumnInteger1 = Integer.parseInt(secondColumnCharacter1) - 1;
            secondColumnInteger2 = Integer.parseInt(secondColumnCharacter2) - 1;
            dif = secondColumnInteger2 - secondColumnInteger1;
            System.out.println();
            printMultiDimensionalArray(putShip(value.getLengthOfShips()));
        }


    }
//    }


//    }

    public static int count = 0;

    public static int findCharactersSubtrack(String first, String second) {

        count = 0;
        for (char i = first.charAt(0); i <= second.charAt(0); i++) {
            count++;
        }

        return count;
    }

    public static String[][] putShip(String[] akif) {
        String[][] mehmet = firstPlayerOcean;
        int b = findCharactersSubtrack(firstColumnCharacter1, firstColumnCharacter2);
        if (firstColumnCharacter1.equals(firstColumnCharacter2) || (secondColumnInteger1 == secondColumnInteger2)) {
            if (Math.abs(dif) == akif.length || b == akif.length) {

                if (Math.abs(dif) == akif.length) {
                    for (int i = secondColumnInteger1; i <= secondColumnInteger2; i++) {
                        mehmet[column(firstColumnCharacter1)][i] = "O";

                    }
                }
                int a = column(firstColumnCharacter1);
                if (b == akif.length) {
                    b = b + a;
                    for (int i = a; i < b; i++) {
                        mehmet[i][secondColumnInteger1] = "O";
                    }
                }


            }
        }
        return mehmet;
    }

}

