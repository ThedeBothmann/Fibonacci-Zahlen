import java.util.Scanner;

public class fibonacci_offical {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Welche Fibonacci-Zahl möchtest du wissen? (Bitte nur von der 11. bis zur 92.)");
        int zahl = s.nextInt();
        fibonacci_folge.ausfuerung(zahl);
        System.out.println("Willst du die Zahlen noch zusätzlich in der Konsole ausgegeben haben? (True=Ja, False=Nein)");
        boolean mehr =s.nextBoolean();
        if(mehr){
        Reader.Lesen();
        }
    }
}
