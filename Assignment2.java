//Muhammad Rafay Khan, #39-SecB, First Year Evening.

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How big is your matrix? (enter n for n x n): ");
        int size = input.nextInt();

        int[][] grid = new int[size][size];

        System.out.println("Enter the elements row by row:");
        for (int row = 0; row < size; row++) {
            System.out.print("Row " + (row + 1) + ": ");
            for (int col = 0; col < size; col++) {
                grid[row][col] = input.nextInt();
            }
        }

        System.out.println("\nYour matrix:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.printf("%6d", grid[row][col]);
            }
            System.out.println();
        }

        System.out.println("\nRow-wise sums:");
        for (int row = 0; row < size; row++) {
            int total = 0;
            for (int col = 0; col < size; col++) {
                total += grid[row][col];
            }
            System.out.println("  Row " + (row + 1) + " -> " + total);
        }

        System.out.println("\nColumn-wise sums:");
        for (int col = 0; col < size; col++) {
            int total = 0;
            for (int row = 0; row < size; row++) {
                total += grid[row][col];
            }
            System.out.println("  Column " + (col + 1) + " -> " + total);
        }

        int diagTotal = 0;
        for (int i = 0; i < size; i++) {
            diagTotal += grid[i][i];
        }
        System.out.println("\nMain diagonal sum (top-left to bottom-right): " + diagTotal);

        int reverseDiagTotal = 0;
        for (int i = 0; i < size; i++) {
            reverseDiagTotal += grid[i][size - 1 - i];
        }
        System.out.println("Reverse diagonal sum (top-right to bottom-left): " + reverseDiagTotal);

        input.close();
    }
}