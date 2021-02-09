package assignment;

import java.util.Scanner;

public class Matrixaddandsub {
    /**
     * @param mat1 1st matrix to add
     * @param mat2 2nd matrix to add
     * @param row  number of rows in the matrix
     * @param col  number of cols in the matrix
     *             it will print addition of mat1 and mat2
     */
    public static void addition(int mat1[][], int mat2[][], int row, int col) {
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    public static void subtraction(int mat1[][], int mat2[][], int row, int col) {
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = mat1[i][j] - mat2[i][j];

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        System.out.println("Enter the elements of 1st martix row wise \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix row wise \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of above two matrix\n");
        addition(mat1, mat2, row, col);
        System.out.println("Subtraction of above two matrix\n");
        subtraction(mat1, mat2, row, col);

    }
}
