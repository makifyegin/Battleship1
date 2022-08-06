import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String s = reader.readLine();
        StringBuilder a = new StringBuilder(s);
        System.out.println(a.reverse());
        reader.close();
    }
}
