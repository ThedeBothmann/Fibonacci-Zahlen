import java.util.*;
import java.io.*;


//public class fibonacci_folge {
  //  public static void Iteration(int a, int b){

   // }

    public static void main(String[] args) {
        Writer fz = null;

        int[] fibonaccioffical = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        boolean weiter = true;
        long a = 0;
        long b = 1;
        long c = 1;
        int i = 1;
        long vgl = Vergleich.v.fkt(c, fibonaccioffical[0]);
        if (vgl == 0) {
            System.out.println(c);
            while (weiter) {
                if (i < 10) {
                    c = a + b;
                    a = b;
                    b = c;
                    vgl = Vergleich.v.fkt(c, fibonaccioffical[i]);
                    if (vgl==0) {
                        System.out.println(c);
                        weiter = true;
                    } else {
                        System.out.println("Dieser Code ist falsch!");
                        weiter = false;
                    }
                    i++;
                } else {
                    System.out.println("Dieser Code scheint korrekt zu sein!");
                    int j;
                    for (j = 10; j < 92; j++) {
                        c = a + b;
                        a = b;
                        b = c;
                        System.out.println(c);
                    }
                    weiter = false;
                }
            }
        }
        else {
            System.err.println("Die Eingabewerte sind falsch");
        }

    }
}