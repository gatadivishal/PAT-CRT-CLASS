import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Greatest_of_four_numbers {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (a >= b && a >= c && a >= d) {
            System.out.println(a);
        } else if (b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

    }
}