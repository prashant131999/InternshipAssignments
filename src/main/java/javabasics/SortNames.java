package javabasics;

import java.util.Scanner;

public class SortNames {
    /**
     * This method is used to merge the two sorted arrays
     * @param a This is the string array that is input by the user
     * @param from  lower end of the array
     * @param mid mid of the array
     * @param to upper end of the array
     * @return void This returns nothing. It just merges the two sorted arrays.
     */
    public static void merge(String[] a, int from, int mid, int to)
    {
        int n = to - from + 1;
        String[]b = new String[n];
        int i1 = from;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= to)
        {
            if (a[i1]!=null&&a[i1].compareTo(a[i2]) > 0)
            {
                b[j] = a[i1];
                i1++;
            }
            else
            {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }
        while (i1 <= mid)
        {
            b[j] = a[i1];
            i1++;
            j++;
        }

        // copy any remaining entries of the second half
        while (i2 <= to)
        {
            b[j] = a[i2];
            i2++;
            j++;
        }

        // copy back from the temporary array
        for (j = 0; j < n; j++)
            a[from + j] = b[j];
    }

    /**
     * This method is used to sort the array
     * @param a This is the string array that is input by the user
     * @param from This is the starting point of array
     * @param to This is the ending point of array
     * @return void This returns nothing. It just sort the array and then merge using merge method.
     */
    public static void mergeSort(String[] a, int from, int to)
    {
        if (from == to)
            return;
        int mid = (from + to) / 2;
        // sort the first and the second half
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }

    /**
     * This is the main method which takes length and string as input and makes use of mergeSort method.
     * @param args Ununsed
     * @return Nothing
     */
    public static void main(String[] args)
    {
        System.out.println("Enter length of string: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner st = new Scanner(System.in);
        String names[] = new String[n];

        System.out.println("Enter names: ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter name [ " + (i+1) +" ]: ");
            names[i] = st.nextLine();
        }

        mergeSort(names,0,n-1);
        for(int i=n-1;i>=0;i--)
            System.out.println(names[i]);
    }
}



