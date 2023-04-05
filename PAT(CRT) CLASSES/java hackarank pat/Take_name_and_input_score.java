import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Take_name_and_input_score {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String name = x.next();
        double a = (int) (x.nextDouble() * 1000) / 1000.0;
        System.out.printf("My name is %s. My Score is %.3f%%.", name, a);

    }
}