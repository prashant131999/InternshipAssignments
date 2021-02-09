package assignment;
import java.util.Scanner;
//check method to check number for prime
public class IsPrime {
    /**
     *
     * @param num is to check this number for prime
     *            this method prints whether num is prime or not
     */
    public static void check(int num)
    {
        int flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not a prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("It is a prime number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        check(num);

    }
}
