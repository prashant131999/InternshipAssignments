package javabasics;

import java.util.Scanner;

public class NumberTable {
    /**
     * this method prints the table of given num
     *
     * @param num to print table for num
     */
    public static void printtable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        printtable(num);

    }
}
