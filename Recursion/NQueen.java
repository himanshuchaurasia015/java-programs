package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        System.out.println("enter size of matrix");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int[] is : arr) {
            Arrays.fill(is, 0);

        }
        solveALL(0, n, arr);

        solve(0, n, arr);
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
        sc.close();
    }

    private static boolean help(int i, int j, int n, int[][] arr) {
        // t
        // Check column above
        for (int row = 0; row < i; row++) {
            if (arr[row][j] == 1) {
                return false;
            }
        }

        // Check top-left diagonal
        for (int row = i, col = j; row >= 0 && col >= 0; row--, col--) {
            if (arr[row][col] == 1) {
                return false;
            }
        }

        // Check top-right diagonal
        for (int row = i, col = j; row >= 0 && col < n; row--, col++) {
            if (arr[row][col] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean solve(int i, int n, int[][] arr) {
        if (i == n) {
            return true;
        }
        for (int j = 0; j < arr.length; j++) {
            if (help(i, j, n, arr)) {
                arr[i][j] = 1;
                if (solve(i + 1, n, arr))
                    return true;
                arr[i][j] = 0;

            }

        }
        return false;

    }

    private static void solveALL(int i, int n, int[][] arr) {
        if (i == n) {
            for (int[] is : arr) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println("--------------------------------------");
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if (help(i, j, n, arr)) {
                arr[i][j] = 1;
                solveALL(i + 1, n, arr);
                arr[i][j] = 0;

            }

        }

    }
}
