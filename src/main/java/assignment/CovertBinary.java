package assignment;
import java.util.Scanner;

/**
 * this class contain method convertdectobin which converts decimal to binary
 */
public class CovertBinary {
    /**
     *
     * @param num to convert the given num to binary
     *            this method print the binary of given decimal number
     */
    public static void convertdectobin(int num)
    {
        //binarynum stores the binary number
        int [] binarynum=new int[1000];
        int i=0;
        while(num>0)
        {
            binarynum[i]=num%2;
            num=num/2;
            i++;
        }
        //prints the binary from back
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binarynum[j]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        convertdectobin(num);

    }
}
