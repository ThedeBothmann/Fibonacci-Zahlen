import java.io.*;

public class Reader {
    public static void Lesen () {
        FileReader reader = null;
        try {
            reader = new FileReader("bin/Fibonacci-Zahlen_Liste.txt");

            for (int c; (c = reader.read()) != -1; )
                System.out.print((char) c);
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei!");
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
            }
        }
    }
}
