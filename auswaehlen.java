import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class auswaehlen {
    public static void an(int[] wichtig) throws IOException {
        int longus = wichtig.length;
        Scanner scanner;
        try {
            for (int j=0; j<longus; j++) {
                System.out.println(getLineNumber(wichtig[j]--, "bin/Fibonacci-Zahlen_Liste.txt"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getLineNumber(int num, String file) throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader(file));
        for (int i = 0; i < num - 1; i++)
            reader.readLine();
        return reader.readLine();
    }
}

