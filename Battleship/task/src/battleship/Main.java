package battleship;

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

    public static void main(String[] args) {
        Field firstPlayer = new Field();
        Field secondPlayer = new Field();
        String[][] firstPlayerOcean = new String[10][10];
        String[][] secondPlayerOcean = new String[10][10];
        // Write your code here
        Scanner scanner = new Scanner(System.in);
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
        firstPlayerOcean[column(firstColumnCharacter1)][secondColumnInteger1] = "O";
        firstPlayerOcean[column(firstColumnCharacter2)][secondColumnInteger2] = "O";

        printMultiDimensionalArray(firstPlayerOcean);


    }

    public static int count = 0;

    public static int findCharactersSubtrack(String first, String second) {

        for (char i = first.charAt(0); i < second.charAt(0); i++) {

            count++;
        }

        return count;
    }


    public static String[][] putShip(String[] akif) {

        if (firstColumnCharacter1.equals(firstColumnCharacter2) || (secondColumnInteger1 == secondColumnInteger2)) {
            if (Math.abs(dif) == akif.length || findCharactersSubtrack(firstColumnCharacter1,firstColumnCharacter2)==akif.length) {

                if (Math.abs(dif)==akif.length) {
                    for (int i = secondColumnInteger1; i <=secondColumnInteger2 ; i++) {



                    }
                }




            }
            }

        }
    }

