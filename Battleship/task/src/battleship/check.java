package battleship;

import java.util.Scanner;

public class check {

    public boolean checkTouching() {

        return true;
    }

    public static String[][] oc = new String[10][10];


    public static void main(String[] args) {
        fillOc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the coordinates");
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();

        fillSpec(2, 2);
        while (checkOc(i, i1)) {

            fillSpec(i, i1);
            printOc();

        }


    }

    public static void printOc() {
        for (int i = 0; i < oc.length; i++) {
            System.out.println();
            for (int i1 = 0; i1 < oc.length; i1++) {
                System.out.print(oc[i][i1]);
            }
        }

    }

    public static String[][] fillOc() {

        for (int i = 0; i < oc.length; i++) {

            for (int i1 = 0; i1 < oc.length; i1++) {
                oc[i][i1] = "0";
            }
        }

        return oc;
    }

    public static String[][] fillSpec(int i, int i1) {
        oc[i][i1] = "J";
        return oc;
    }

    public static boolean result;

    public static boolean checkOc(int i, int i1) {

            try {

                if (fillOc()[i][i1].equals("J") || fillOc()[i + 1][i1].equals("J") || fillOc()[i - 1][i1].equals("J")) {
                    result = false;
                } else {
                    result = true;
                }
                if (fillOc()[i][i1].equals("J") || fillOc()[i][i1 + 1].equals("J") || fillOc()[i][i1 - 1].equals("J")) {
                    result = false;
                } else {
                    result = true;
                }


            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

            return result;
        }



}
