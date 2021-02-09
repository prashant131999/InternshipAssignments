package javabasics;

import java.util.Scanner;

/**
 * extractwords method to extract word and print them
 */
public class ExtractWords {
    /** this method return the extracted words when space encounterss
     * @param scentence this param takes scentence as a input
     *
     */
    public static void extractwords(String scentence) {
        char ch;
        for (int i = 0; i < scentence.length(); i++) {
            ch = scentence.charAt(i);
            if (ch != ' ') {
                System.out.print(ch);
            } else {
                System.out.println("\n");
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String scentence = sc.nextLine();
        extractwords(scentence);
    }
}

