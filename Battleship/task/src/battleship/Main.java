package battleship;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        char[][] field = new char[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '~';
            }
        }
    }
}
