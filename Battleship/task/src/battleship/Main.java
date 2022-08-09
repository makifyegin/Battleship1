package battleship;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main extends Field {


    public static void main(String[] args) {
        Field firstPlayer = new Field();
        Field secondPlayer = new Field();
        String[][] firstPlayerOcean = new String[10][10];
        String[][] secondPlayerOcean = new String[10][10];
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String firstColumn = scanner.next();
        String secondColumn = scanner.next();
        String firstColumnCharacter = "" + firstColumn.charAt(0);
        String secondColumnCharacter = "" + firstColumn.charAt(1);



        String x = "" + secondColumn.charAt(0);
        String secondColumnCharacterSecond = "" + secondColumn.charAt(0);



        int secondColumnInteger = Integer.parseInt(secondColumnCharacter) - 1;
        firstPlayerOcean = firstPlayer.createOcean();
        firstPlayerOcean[column(firstColumnCharacter)][secondColumnInteger] = "O";
        firstPlayerOcean[column(secondColumnCharacterSecond)][secondColumnInteger] = "O";

        printMultiDimensionalArray(firstPlayerOcean);


    }
}

