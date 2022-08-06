import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        try (Scanner scanner1 = new Scanner(new File("test1.txt"));
             Scanner scanner2 = new Scanner(new File("test2.txt"))) {
            // some code
        }
    }
}
