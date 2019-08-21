import java.util.*;
import java.io.*;


public class fibonacci_folge {
    public static void main(String[] args) {
        Writer fz = null;
        int[] fibonaccioffical = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        boolean weiter = true;
        long a = 0;
        long b = 1;
        long c = 1;
        int i = 1;
        int z =1;
        String s;
        long vgl = Vergleich.v.fkt(c, fibonaccioffical[0]);
        if (vgl == 0) {
            try {
                s = ("Die " + z + ". Fibonacci-Zahl ist "+ c);
                z++;
                fz = new FileWriter("Fibonacci-Zahlen_Liste.txt");
                fz.write(s);
                fz.append(System.getProperty("line.separator"));
                System.out.println(c);
                while (weiter) {
                    if (i < 10) {
                        c = a + b;
                        a = b;
                        b = c;
                        vgl = Vergleich.v.fkt(c, fibonaccioffical[i]);
                        if (vgl == 0) {
                            s = ("Die " + z + "." + " Fibonacci-Zahl ist "+ c);
                            z++;
                            fz.write(s);
                            fz.append(System.getProperty("line.separator"));
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
                            s = ("Die " + z + ". Fibonacci-Zahl ist "+ c);
                            z++;
                            fz.write(s);
                            fz.append(System.getProperty("line.separator"));
                            System.out.println(c);
                        }
                        weiter = false;
                    }
                }
            }
            catch(IOException e) {
                System.err.println("Datei konnte nicht geladen werden");
            }
            finally {
                if (fz != null)
                    try {
                        fz.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }
        else {
            System.err.println("Die Eingabewerte sind falsch");
        }

    }
}