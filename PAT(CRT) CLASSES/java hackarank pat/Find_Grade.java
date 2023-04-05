import java.io.*;
import java.util.*;

public class Find_Grade {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        if (a >= 701 && a <= 900) {
            System.out.println("My name is " + s + ". My Grade is A.");
        } else if (a >= 125 && a <= 600) {
            System.out.println("My name is " + s + ". My Grade is B.");
        } else if (a <= 624 && a >= 610) {
            System.out.println("My name is " + s + ". My Grade is C.");
        } else if (a <= 32 && a >= 27) {
            System.out.println("My name is " + s + ". My Grade is D.");
        } else {
            System.out.println("My name is " + s + ". My Grade is F.");
        }

    }
}