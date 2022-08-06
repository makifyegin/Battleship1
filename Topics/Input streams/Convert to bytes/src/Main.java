import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

        String result = "";
        int charAsNumber = inputStream.read();
        while (charAsNumber != -1) {
            result = "" + charAsNumber;
            charAsNumber = inputStream.read();
            System.out.print(result);
        }


        inputStream.close();
    }
}
