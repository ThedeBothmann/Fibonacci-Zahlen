import javax.swing.*;

public class fibonacci_folge {
    public static void main (String [] args){
        int [] fibonaccioffical = {1,1,2,3,5,8,13,21,34,55};
        int a=0;
        int b=1;
        int c=1;
        if(c==fibonaccioffical[0]) {
            System.out.println(c);
        }
        else{
            System.out.println("Dieser Code ist falsch");
        }
        for(int i=1;i<10;i++){
            c=a+b;
            a=b;
            b=c;
            if(c==fibonaccioffical[i]) {
                System.out.println(c);
            }
            else{
                System.out.println("Dieser Code ist falsch");
            }
        }
    }
}
