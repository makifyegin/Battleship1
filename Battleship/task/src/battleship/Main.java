package battleship;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
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
    ships value;
    public static int i = 0;

    public static void main(String[] args) {

        String shipName;
        Field secondPlayer = new Field();
        Field firstPlayer = new Field();

        String[][] secondPlayerOcean = new String[10][10];
        // Write your code here
        Scanner scanner = new Scanner(System.in);
//        while () {


//        int b7 = findCharactersSubtrack(firstColumnCharacter1, firstColumnCharacter2);

        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        printMultiDimensionalArray(firstPlayer.createOcean());
        firstPlayerOcean = firstPlayer.createOcean();
        System.out.println();


        ships[] values = ships.values();

        for (i = 0; i < values.length;) {



            System.out.printf("Enter the coordinates of the %s (%d cells)\n",  values[i].getNameOfShips(), values[i].getLengthOfShips().length);
            System.out.println();
            firstColumn = scanner.next();
            secondColumn = scanner.next();
            firstColumnCharacter1 = "" + firstColumn.charAt(0);
            secondColumnCharacter1 = "" + firstColumn.charAt(1);
            firstColumnCharacter2 = "" + secondColumn.charAt(0);
            secondColumnCharacter2 = "" + secondColumn.charAt(1);
            secondColumnInteger1 = Integer.parseInt(secondColumnCharacter1) - 1;
            secondColumnInteger2 = Integer.parseInt(secondColumnCharacter2) - 1;
            dif = secondColumnInteger2 - secondColumnInteger1;

            String[] akif = values[i].getLengthOfShips();
            String[][] mehmet = firstPlayerOcean;
            int b = findCharactersSubtrack(firstColumnCharacter1, firstColumnCharacter2);
            if (firstColumnCharacter1.equals(firstColumnCharacter2) || (secondColumnInteger1 == secondColumnInteger2)) {
                if (Math.abs(dif) + 1 == akif.length || b == akif.length) {
                    if (Math.abs(dif) + 1 == akif.length) {
                        System.out.println();
                        for (int m = 0; m <= 10; m++) {
                            if (m == 0) {
                                System.out.print("  ");
                            } else {
                                System.out.print(m + " ");
                            }
                        }
                        for (int i = secondColumnInteger1; i <= secondColumnInteger2; i++) {
                            mehmet[column(firstColumnCharacter1)][i] = "O";

                        }
                    }
                    int a = column(firstColumnCharacter1);
                    if (b == akif.length) {
                        for (int m = 0; m <= 10; m++) {
                            if (m == 0) {
                                System.out.print("  ");
                            } else {
                                System.out.print(m + " ");
                            }
                        }
                        b = b + a;
                        for (int i = a; i < b; i++) {
                            mehmet[i][secondColumnInteger1] = "O";
                        }

                    }
                    i++;
                    printMultiDimensionalArray(mehmet);
                } else {
                    System.out.printf("Error! Wrong length of the %s! Try again:\n", ships.values());
                    System.out.println();
                }

            }
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


}

