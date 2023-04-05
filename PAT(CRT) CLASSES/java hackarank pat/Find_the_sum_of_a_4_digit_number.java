import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_the_sum_of_a_4_digit_number {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n <= 9999) {
            System.out.println((n / 1000) % 10 + (n / 100) % 10 + (n / 10) % 10 + n % 10);
        } else {
            System.out.println("Not a 4 digit number.");
        }
    }
}