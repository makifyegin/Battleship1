package battleship;

import java.util.Arrays;

public class Field {

    private static int row;
    private static int columnInteger;

    public static int getRow() {
        return row;
    }

    public static void setRow(int row) {
        Field.row = row;
    }

    public static int getColumnInteger() {
        return columnInteger;
    }

    public static void setColumnInteger(int columnInteger) {
        Field.columnInteger = columnInteger;
    }

    public static final String[][] myOcean = new String[10][10];  //Multidimensional Array[10][10] as a String


    public static final String[] aircraft = new String[5];
    public static final String[] battleship = new String[4];
    public static final String[] submarine = new String[3];
    public static final String[] cruise = new String[3];
    public static final String[] destroyer = new String[2];


    public String[][] createOcean() {
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


        // ~ denotes the fog of war
        // O denotes a cells with your ship
        // X denotes that the ship was hit?


        return myOcean;
    }

    public static void printMultiDimensionalArray(String[][] akif) {


        System.out.println();
        for (int i = 0, l = 'A'; i < akif.length; i++, l++) {
            System.out.print("" + Character.toString(l) + " ");
            for (int j = 0; j < akif[i].length; j++) {
                System.out.print((akif[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static int column(String column) {

        switch (column) {
            case "A":
                Field.columnInteger = 0;
                break;
            case "B":
                Field.columnInteger = 1;
                break;
            case "C":
                Field.columnInteger = 2;
                break;
            case "D":
                Field.columnInteger = 3;
                break;
            case "E":
                Field.columnInteger = 4;
                break;
            case "F":
                Field.columnInteger = 5;
                break;
            case "G":
                Field.columnInteger = 6;
                break;
            case "H":
                Field.columnInteger = 7;
                break;
            case "I":
                Field.columnInteger = 8;
                break;
            case "J":
                Field.columnInteger = 9;
                break;

        }
        return Field.columnInteger;
    }


    public enum ships {
        aircraft(Field.aircraft, "Aircraft Carrier"),
        battleship(Field.battleship, "Battleship"),
        submarine(Field.submarine, "Submarine"),
        cruise(Field.cruise, "Cruiser"),
        destroyer(Field.destroyer, "Destroyer");
        String[] lengthOfShips;
        String nameOfShips;

        ships(String[] lengthOfShips, String nameOfShips) {
            this.lengthOfShips = lengthOfShips;
            this.nameOfShips = nameOfShips;
        }

        public String[] getLengthOfShips() {
            return lengthOfShips;
        }

        public String getNameOfShips() {
            return nameOfShips;
        }

        public static ships findByLengthOfShip(int lengthOfShips) {
            for (ships value : values()) {
                if (value.lengthOfShips.length==lengthOfShips) {
                    return value;
                }
            }


            return null;
        }
    }


}