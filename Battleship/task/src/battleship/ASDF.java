package battleship;

public class ASDF {
    public static int count = 0;

    public static int findCharactersSubtrack(String first, String second) {
        if (first.charAt(0) < second.charAt(0)) {
            int a = 0;
            for (char i = first.charAt(0); i <= second.charAt(0); i++) {
                a++;
            }

            count = a;

        } else {

            int b = 0;
            for (char i = second.charAt(0); i <= first.charAt(0); i++) {
                b++;
            }

            count = b;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findCharactersSubtrack("B9", "D9"));
    }
}
