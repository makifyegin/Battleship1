package battleship;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class Main extends Field {
    public static String firstColumn;
    public static String secondColumn;
    public static String firstColumnCharacter1;
    public static String secondColumnCharacter1;
    public static String firstColumnCharacter2;
    public static String secondColumnCharacter2;
    public static int secondColumnInteger1;
    ;
    public static int secondColumnInteger2;
    ;

    public static int dif;

    public static String[][] firstPlayerOcean = new String[10][10];
    ships value;
    public static int i = 0;

    public static int subtractingCharsInteger;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String shipName;
        Field secondPlayer = new Field();
        Field firstPlayer = new Field();

        // Write your code here
        zeroToTen();
        printMultiDimensionalArray(firstPlayer.createOcean());
        firstPlayerOcean = firstPlayer.createOcean();
        System.out.println();
        ships[] values = ships.values();


        for (i = 0; i < values.length; i++) {
            System.out.printf("Enter the coordinates of the %s (%d cells)\n", values[i].getNameOfShips(), values[i].getLengthOfShips().length);
            System.out.println();
            firstColumn = scanner.next();
            secondColumn = scanner.next();

            firstColumnCharacter1 = "" + firstColumn.charAt(0);
            if (firstColumn.length() > 2) {
                secondColumnCharacter1 = "" + firstColumn.charAt(1) + firstColumn.charAt(2);
            } else {

                secondColumnCharacter1 = "" + firstColumn.charAt(1);
            }

            firstColumnCharacter2 = "" + secondColumn.charAt(0);
            if (secondColumn.length() > 2) {
                secondColumnCharacter2 = "" + secondColumn.charAt(1) + secondColumn.charAt(2);
            } else {

                secondColumnCharacter2 = "" + secondColumn.charAt(1);
            }

            secondColumnInteger1 = Integer.parseInt(secondColumnCharacter1);
            secondColumnInteger2 = Integer.parseInt(secondColumnCharacter2);
            dif = Math.max(secondColumnInteger1, secondColumnInteger2) - Math.min(secondColumnInteger1, secondColumnInteger2);
            subtractingCharsInteger = findCharactersSubtrack(firstColumnCharacter1, firstColumnCharacter2);


            String[] eachShipLengthArray = values[i].getLengthOfShips(); // ship length as an Array
            String[][] firstPlayerOceanBoard = firstPlayerOcean;        // Ocean Board


            if (firstColumnCharacter1.equals(firstColumnCharacter2) || (secondColumnInteger1 == secondColumnInteger2)) {
                if (Math.abs(dif) == eachShipLengthArray.length - 1 || subtractingCharsInteger == eachShipLengthArray.length - 1) {
                    if (Math.abs(dif) == eachShipLengthArray.length - 1) {
                        System.out.println();


                        for (int i = Math.min(secondColumnInteger1, secondColumnInteger2) - 1; i < Math.max(secondColumnInteger1, secondColumnInteger2); i++) {
                            firstPlayerOceanBoard[column(firstColumnCharacter1)][i] = "O";

//                            try {
//                                while (firstPlayerOceanBoard[column(firstColumnCharacter1)][i].equals("0")) {
//                                    System.out.println("Error! Wrong ship location! Try again:");
//                                    System.out.println();
//                                }
//                                while (firstPlayerOceanBoard[column(firstColumnCharacter1)][i + 1].equals("0") || firstPlayerOceanBoard[column(firstColumnCharacter1)][i - 1].equals("0")) {
//                                    System.out.println("Error! You placed it too close to another one. Try again:");
//
//                                }
//                            } catch (ArrayIndexOutOfBoundsException e) {
//
//                                e.printStackTrace();
//                            }
                        }


                    }
                    int a = column(firstColumnCharacter1);
                    if (subtractingCharsInteger == eachShipLengthArray.length-1) {



                        subtractingCharsInteger = subtractingCharsInteger + a;
                        for (int i = a; i <= subtractingCharsInteger; i++) {
//                            try {
//
//                                if (firstPlayerOceanBoard[column(firstColumnCharacter1)][i].equals("0")) {
//                                    System.out.println("Error! Wrong ship location! Try again:");
//                                } else if (firstPlayerOceanBoard[column(firstColumnCharacter1)][i + 1].equals("0") || firstPlayerOceanBoard[column(firstColumnCharacter1)][i - 1].equals("0")) {
//                                    System.out.println("Error! You placed it too close to another one. Try again:");
//                                }
//
//                            } catch (ArrayIndexOutOfBoundsException e) {
//                                e.printStackTrace();
//                            }

                            firstPlayerOceanBoard[i][secondColumnInteger1-1] = "O";
                        }

                    }
                    zeroToTen();
                    printMultiDimensionalArray(firstPlayerOceanBoard);
                    System.out.println();
                } else {
                    System.out.printf("Error! Wrong length of the %s! Try again:\n", values[i].getNameOfShips());
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
        for (char i = first.charAt(0); i < second.charAt(0); i++) {
            count++;
        }

        return count;
    }


}

