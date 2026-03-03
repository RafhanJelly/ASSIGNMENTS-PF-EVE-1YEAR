//Muhammad Rafay Khan, #39-SecB, First Year Evening.
//Assignment Question: create a java program which takes input of matrices
//and print the sum of its rows and sums coloumns and also the sum of forward and reverse diagnals

import java.util.Scanner;

public class MatrixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements row wise:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row sums:");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += mat[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum += mat[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }

        if (r == c) {
            int fwd = 0;
            int rev = 0;
            for (int i = 0; i < r; i++) {
                fwd += mat[i][i];
                rev += mat[i][r - 1 - i];
            }
            System.out.println("Forward diagonal sum: " + fwd);
            System.out.println("Reverse diagonal sum: " + rev);
        } else {
            System.out.println("Diagonal sums are only valid for square matrices.");
        }

        sc.close();
    }
}
