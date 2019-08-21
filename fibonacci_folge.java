import javax.swing.*;

public class fibonacci_folge {
    public static void main(String[] args) {
        int[] fibonaccioffical = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        boolean weiter = true;
        long a = 0;
        long b = 1;
        long c = 1;
        int i = 1;
        if (c == fibonaccioffical[0]) {
            System.out.println(c);
        } else {
            System.out.println("Dieser Code ist falsch");
        }
        while (weiter == true) {
            if (i < 10) {
                c = a + b;
                a = b;
                b = c;
                if (c == fibonaccioffical[i]) {
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
}