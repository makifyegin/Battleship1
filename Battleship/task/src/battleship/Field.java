package battleship;

import java.util.Arrays;

public class Field {

    public static final String[][] myOcean = new String[10][10];  //Multidimensional Array[10][10] as a String

    public static final String[] aircraft = new String[5];
    public static final String[] battleship = new String[4];
    public static final String[] submarine = new String[3];
    public static final String[] cruise = new String[3];
    public static final String[] destroyer = new String[2];


    public  String[][] createOcean() {
        for (int i = 0; i < myOcean.length; i++) {
            for (int j = 0; j < myOcean[i].length; j++) {
                myOcean[i][j] = "~";
            }

        }
        Arrays.fill(aircraft, 0, aircraft.length, "O");
        Arrays.fill(battleship, 0, battleship.length, "O");
        Arrays.fill(cruise, 0, cruise.length, "O");
        Arrays.fill(destroyer, 0, destroyer.length, "O");
        Arrays.fill(submarine, 0, submarine.length, "O");
        System.out.print("  ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0, l = 'A'; i < myOcean.length; i++, l++) {
            System.out.print("" + Character.toString(l) + " ");
            for (int j = 0; j < myOcean[i].length; j++) {
                System.out.print((myOcean[i][j]) + " ");
            }
            System.out.println();

            // ~ denotes the fog of war
            // O denotes a cells with your ship
            // X denotes that the ship was hit?


        }
        return myOcean;
    }
}
