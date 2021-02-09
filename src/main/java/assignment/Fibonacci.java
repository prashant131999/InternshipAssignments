package assignment;

import java.util.Scanner;

/**
 * this class contain fibonacci method to print fibonacci
 */
public class Fibonacci {
    /**
     * @param num is the value upto which we print fibbonaci series
     *            this function prints finobaci series starting from 1
     */

    public static void fibonacci(int num) {
        //a is first number
        int a = 1;
        //b is second number
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i < num; i++) {
            //adding the previous to number
            int c = a + b;
            //print the added number
            System.out.print(c + " ");
            //updates the previous two values
            a = b;
            b = c;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till we want to print fibonacci");
        int num = sc.nextInt();
        fibonacci(num);
    }
}
