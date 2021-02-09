package assignment;

import java.util.Scanner;

public class SumOfDigits {
    /**
     * @param num is a number for which we find sum of digits
     * @return sum of digits of num
     */
    public static int sumofdigits(int num) {
        int sum = 0;
        while (num > 0) {
            //add the rem to sum
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int result = sumofdigits(num);
        System.out.print(result);

    }
}
