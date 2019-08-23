import java.io.IOException;
import java.util.Scanner;

public class fibonacci_offical {
    public static void main (String [] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Welche Fibonacci-Zahl möchtest du wissen? (Bitte nur von der 11. bis zur 92.)");
        int zahl = s.nextInt();
        fibonacci_folge.ausfuerung(zahl);
        System.out.println("Alle vorherigen Fibonacci-Zahlen findest du im Dokument Fibonacci-Zahlen_Liste.txt");
        System.out.println("Willst du die Zahlen noch zusätzlich in der Konsole ausgegeben haben? (Ja=True, Nein=False)");
        boolean mehr =s.nextBoolean();
        if(mehr){
        Reader.Lesen();
        }
        System.out.println("Möchtest du noch einige bestimmte andere Fibonacci Zahlen haben? (Ja=True, Nein=False)");
        boolean noch_mehr = s.nextBoolean();
        if (noch_mehr){
            System.out.println("Wie viele denn?");
            int anzahl =s.nextInt();
            int [] wichtig = new int [anzahl];
            System.out.println("Dann her damit (auch hier bitte nur von 11 bis 92)");
            for (int i=0; i<anzahl; i++){
                wichtig[i] = s.nextInt();
            }
            System.out.println(" ");
            auswaehlen.an(wichtig);
        }
    }
}
